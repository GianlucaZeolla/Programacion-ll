package aa;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 200;
		int b = 500;
		Scanner sc = new Scanner(System.in);
		System.out.println("tipo de operacion 1-suma,2-resta,3-producto");
		int opcion = sc.nextInt();
		System.out.println("resultado " + operar(a,b,opcion));
		

	}

	private static double operar(int a, int b, int opcion) {
		// TODO Auto-generated method stub
		double rta = 0;
		switch(opcion) {
		case 1:
			rta = a + b;
			break;
		case 2:
			rta = a-b;
			break;
		case 3: 
			rta = a*b;
			break;
		case 4:
			if(b==0) {break;}
			rta = a/b;
			
			default:
		}
		return rta;
	}

}
