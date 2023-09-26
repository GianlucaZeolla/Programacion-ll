import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = "gianluca";
        String apelido = "zeolla";

        int numeroUsuario1;
        int numeroUsuario2;



        System.out.println(nombre + " " + apelido);

        System.out.println("ingrese dos numeros");
        System.out.println("primer numero: ");
        System.out.println("segundo numero: ");

        numeroUsuario1 = scanner.nextInt();
        numeroUsuario2 = scanner.nextInt();

        if (numeroUsuario1 > numeroUsuario2) {
            System.out.println(" es mayor el primer numero");
        } else if (numeroUsuario2 > numeroUsuario1){
            System.out.println(" es mayor el segundo numero");
        } else {
            System.out.println("son iguales");
        }
    }
}
