
package estruturacondicional;

import java.util.Scanner;


public class tabuada {
    public static void main(String[] args) {
     
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva seu nome, para saber a quantidade de letras: ");
        String nome = teclado.nextLine();
        System.out.println("Quantidade: " + nome.length());
        int tab = nome.length();
        System.out.println("____________________");
        System.out.println("                    ");
        System.out.println("Tabuada de "+ tab);
        System.out.println(tab+ " x 1 = "+ tab * 1);
        System.out.println(tab+ " x 1 = "+ tab * 2);
        System.out.println(tab+ " x 1 = "+ tab * 3);
        System.out.println(tab+ " x 1 = "+ tab * 4);
        System.out.println(tab+ " x 1 = "+ tab * 5);
        System.out.println(tab+ " x 1 = "+ tab * 6);
        System.out.println(tab+ " x 1 = "+ tab * 7);
        System.out.println(tab+ " x 1 = "+ tab * 8);
        System.out.println(tab+ " x 1 = "+ tab * 9);
        System.out.println(tab+ " x 1 = "+ tab * 10);
        
    }
}
