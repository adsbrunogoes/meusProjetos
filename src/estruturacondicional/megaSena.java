
package estruturacondicional;

import java.util.Random;

public class megaSena {
    public static void main(String[] args) {
        Random gerador = new Random();
            System.out.println("Numeros da mega: ");
            System.out.println("_____________________________");
            System.out.print("| ");
            System.out.print(gerador.nextInt(60)+1 + " - ");
            System.out.print(gerador.nextInt(60)+1 + " - ");
            System.out.print(gerador.nextInt(60)+1 + " - ");
            System.out.print(gerador.nextInt(60)+1 + " - ");
            System.out.print(gerador.nextInt(60)+1 + " - ");
            System.out.println(gerador.nextInt(60)+1 + " | ");
            System.out.println("------------------------------");
    }        
}
