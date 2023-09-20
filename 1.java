import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese dos numeros: ");

        int numero1 = 0;
        int numero2 = 0;

        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();


        if (numero1 > numero2) {
            System.out.println("el primer numero es mayor");
        } else if (numero1 < numero2) {
            System.out.println("el segundo numero es mayor ") ;
            } else {
                System.out.println("los dos numeros tienen el mismo valor");
            }
        }
    }
