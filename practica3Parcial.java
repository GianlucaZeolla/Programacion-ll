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

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 2 == 0) {
                System.out.println("el numero en la posicion " + i + " es par");
            } else {
                System.out.println("el numero en la posicion " + i + " es impar");
            }
        }
    }
    }

