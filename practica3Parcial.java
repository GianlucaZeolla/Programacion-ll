import java.util.Scanner;

public class tres1 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);


        System.out.println(" ingrese 10 numeros menores a 100");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese numero: " + "#" + (i + 1));

            numeros[i] = scanner.nextInt();
        }

        boolean hayPares = false;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                hayPares = true;
                break;
            }
        }
        if (hayPares) {
            System.out.println("hay numeros pares" );
        }
    }


    }
