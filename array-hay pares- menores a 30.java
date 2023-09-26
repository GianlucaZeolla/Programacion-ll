import java.util.Scanner;

public class tres {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese 10 numeros menores a 100  ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" ingresar numero " + " #" + (i + 1));


            numeros[i] = scanner.nextInt();
        }
        boolean hayMenorA30 = false;

        for (int numero: numeros) {
            if (numero < 30) {
                hayMenorA30 = true;
                break;
            }
        }
            if (hayMenorA30){
                System.out.println("hay numeros menores a 30");
            } else {
                System.out.println("no hay numero menores a 30 ");
            }

        boolean hayPares = false;

        for (int numero : numeros) {

            if (numero % 2 == 0) {
                hayPares = true;
                break;
            }
        }
        if (hayPares) {
            System.out.println("hay pares");
        } else {
            System.out.println("no hay numeros pares ");

        }
        boolean mayorA100 = false;
        for (int numero:numeros) {
            if (numero > 100) {
                mayorA100 = true;
                break;
            }

        }
        if (mayorA100) {
            System.out.println("hubo un error, hay un numero mayor a 100");
        }
        }
    }
