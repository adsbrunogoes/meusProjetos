package estruturacondicional;

import java.util.Scanner;

public class quantidadeLetras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva seu nome, para saber a quantidade de letras: ");
        String nome = teclado.nextLine();
        System.out.println("Quantidade: " + nome.length());
        
    }
}
