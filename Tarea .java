package aa;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		
		System.out.println("sistema");
		
		int opcion = 0;
		

		
		Scanner scanner = new Scanner(System.in);
		
		while(opcion !=4) {

		System.out.println("Ingrese una opcion (1-Compras,2-Ventas,3-Reclamos,4-Salir)");

		opcion = scanner.nextInt();

		System.out.println("Su opción es: " + opcion);	
		
		
		if (opcion == 1) {
            System.out.println("Ha seleccionado Compras.");
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado Ventas.");
        } else if (opcion == 3) {
            System.out.println("Ha seleccionado Reclamos.");
        } else if (opcion == 4) {
            System.out.println("Ha seleccionado Salir.");
        } else {
            System.out.println("Opción no válida.");
        }
    }

	

	}
}
