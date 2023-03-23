/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inverterstring;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class InverterString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma String: ");
        String str = scanner.nextLine();

        String invertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }

        System.out.println("String invertida: " + invertida);

    }

}
