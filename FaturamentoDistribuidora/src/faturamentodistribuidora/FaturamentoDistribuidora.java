/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faturamentodistribuidora;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Matheus
 */
public class FaturamentoDistribuidora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            FileReader fr = new FileReader("dados.json");
            JSONParser parser = new JSONParser();

            JSONArray array = (JSONArray) parser.parse(fr);

            double valorMaior = 0;
            double valorMenor = 0;
            double soma = 0;
            int diasFaturaveis = 0;
            

            for (int i = 0; i < array.size(); i++) {

                JSONObject faturamento = (JSONObject) array.get(i);

                double valor = (double) faturamento.get("valor");

                if (i == 0) {
                    valorMaior = valor;
                    valorMenor = valor;
                } else {
                    if (valor > 0 && valor < valorMenor) {
                        valorMenor = valor;
                    }
                    if (valor > valorMaior) {
                        valorMaior = valor;    
                    }
                }

                if (valor > 0) {
                    diasFaturaveis++; 
                }
                
                soma = soma + valor;
                
            }

            
            double media = soma / (double) diasFaturaveis;
            int faturamentoSup = 0;
            
            for (int i = 0; i < array.size(); i++) {

                JSONObject faturamento = (JSONObject) array.get(i);

                double valor = (double) faturamento.get("valor");
                
                if (valor > media) {
                    faturamentoSup++;
                }
            }    

            
            System.out.println("O maior valor do mês foi : "+ valorMaior);
            System.out.println("O menor valor do mês foi : "+valorMenor);
            
            System.out.println("Foram " +faturamentoSup+ " dias em que o valor de faturamento diário foi superior à média mensal.");
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FaturamentoDistribuidora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FaturamentoDistribuidora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(FaturamentoDistribuidora.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
