import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String oponente1 = "rojo";
        String oponente2 = "azul";
        int barraProgresoRojo = random.nextInt(10 + 1);
        int barraProgresoAzul = random.nextInt(10 + 1);
        String finDelJuego = null;
    

        do {


            System.out.println("bienvenido al juego de 2 oponentes, ellos son: " + oponente1 + " y " + oponente2);

            
                System.out.println(" la barra de progreso de " + oponente1 + " es " + barraProgresoRojo);
                System.out.println(" la barra de progreso de " + oponente2 + " es " + barraProgresoAzul);
                System.out.println("si desea continuar ingrese 1 en caso que no ingrese 2");
                finDelJuego = scanner.nextLine();

            } while (finDelJuego.equalsIgnoreCase("1"));

            System.out.println("fin del juego");
            scanner.close();

        }
        }
