package estruturacondicional;
import java.util.Random;

public class numeroAleatorio {
    public static void main(String[] args) {
        Random gerador = new Random();
        int r = -50 + gerador.nextInt(50+50)+1;
        System.out.println(r);
        int pi = r % 2;
        if (pi == 0){
            System.out.print("O numero é par");
        }else{
            System.out.print("O numero é impar");
        }
        if (r >= 0){
                System.out.println(" ,e positivo!");
        }else{
                System.out.println(" ,e negativo!");
            }
    }
}
