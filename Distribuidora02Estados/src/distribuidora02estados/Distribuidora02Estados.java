/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuidora02estados;

/**
 *
 * @author Matheus
 */
public class Distribuidora02Estados {

    public static double calcularPorcentagem(double valor, double valorTotal) {
        double porcentagem = valor / valorTotal * 100;
        return porcentagem;
    }

    public static void printarPorcentagem(String estado, double porcentagem) {
        System.out.println(estado + ", corresponde a " + porcentagem + "% do faturamento mensal");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double valortotal = sp + rj + mg + es + outros;
        double porcentagemsp = calcularPorcentagem(sp, valortotal);
        double porcentagemrj = calcularPorcentagem(rj, valortotal);
        double porcentagemmg = calcularPorcentagem(mg, valortotal);
        double porcentagemes = calcularPorcentagem(es, valortotal);
        double porcentagemoutros = calcularPorcentagem(outros, valortotal);

        printarPorcentagem("São Paulo", porcentagemsp);
        printarPorcentagem("Rio de Janeiro", porcentagemrj);
        printarPorcentagem("Minas Gerais", porcentagemmg);
        printarPorcentagem("Espirito Santo", porcentagemes);
        printarPorcentagem("Outros", porcentagemoutros);

    }

}
