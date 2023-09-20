import java.util.Scanner;

public class punto3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int i = 0;


        do {
            Scanner scanner = new Scanner(System.in);

            for ( i = 0; i < numeros.length; i++) {
                System.out.println("ingrese 10 numeros menores de 100: " + i);

                numeros[i] = scanner.nextInt();
                if (numeros[i] < 100) {
                    System.out.println("ingrese otro");

                } else if (numeros[i] > 30){
                    i++;
                } else {
                    System.out.println("no valido");
                    i--;
                }
            }
        } while (numeros[i] == 10);
        System.out.println("los numeros mayores a 30 son: " + i);
        }
    }
