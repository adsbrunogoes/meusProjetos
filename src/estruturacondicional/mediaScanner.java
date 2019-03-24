
package estruturacondicional;

import java.util.Scanner;

public class mediaScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        int n4 = teclado.nextInt();
        int n5 = teclado.nextInt();
        int media = (n1 + n2 + n3 + n4 + n5) /5;
        System.out.println("A média é: " + media);
    }
}
