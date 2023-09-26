import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
            int[] numeros = new int[10];
            Scanner scanner = new Scanner(System.in);


            System.out.println("ingrese 10 numeros menores a 100");

            for (int i = 0; i < numeros.length; i++) {
                System.out.println(" ingrese un numero: "+ " # " + (i+1));

                numeros[i] = scanner.nextInt();

            }

         for (int i = 0; i < numeros.length; i++) {

             System.out.println("gianluca zeolla");

            if (numeros[i] % 2 == 0) {
                System.out.println("hay numero par");
            } else {
                System.out.println("no hay numero par");
            }
             break;


         }
    }

}
