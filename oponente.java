import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String oponente1 = "rojo";
        String oponente2 = "azul";
        int barraProgresoRojo = random.nextInt(10);
        int barraProgresoAzul = random.nextInt(10);
        int finDelJuego = 0;
        final boolean b = true;


        System.out.println("bienvenido al juego de 2 oponentes, ellos son: " + oponente1 + " y " + oponente2);

        while (barraProgresoRojo < 11) {
            System.out.println(" la barra de progreso de " + oponente1 + " es " + barraProgresoRojo);
            System.out.println(" la barra de progreso de " + oponente2 + " es " + barraProgresoAzul);
            if (barraProgresoRojo == finDelJuego) {
                System.out.println("ingrese o si deseo terminar" + finDelJuego);
            }
            break;
        }
        finDelJuego++;

        System.out.println("fin del juego");


    }
}
