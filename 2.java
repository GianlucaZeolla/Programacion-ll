import java.util.Random;
import java.util.Scanner;

public class punto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingresa un numero del 1 al 10: ");

        int numero = 0;
        int adivinarNumero = random.nextInt(10);

        numero = scanner.nextInt();

        if (numero == adivinarNumero) {
            System.out.println("felicidades");
        } else {
            System.out.println("fallaste este era el numero: " + adivinarNumero);
        }
    }
}
