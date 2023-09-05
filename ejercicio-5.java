/*adivinar un numero del 1 al 10 y agregar 3 intentos*/
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numAdivinar = random.nextInt(10);
        int intentos = 3;

        System.out.println("adivine el numero del 1 al 10");
        System.out.println("solamente tenes " + intentos + " intentos para lograr adivinarlo");

        for (int intento = 1; intento <= intentos; intento++) {
            System.out.println("intento # " + intento + " : ingrese un numero: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numAdivinar) {
                System.out.println(" felicitaciones adivinate el numero " + numAdivinar);
            } else if (intento < intentos) {
                System.out.println("estuvite cerca, vuelve a intentarlo" + (numeroUsuario < numAdivinar));
            } else {
                System.out.println("casi lo conseguis maestro, este era el numero: " + numAdivinar);

            }
            if (numeroUsuario > numAdivinar) {
                System.out.println("mas bajo");
            } else if (numeroUsuario < numAdivinar) {
                System.out.println("mas alto");
            }
        }
    }
}
