public class Main {
    public static void main(String[] args) {

        int[] numeros = {2,5};
        if (determinarSiHayPar(numeros)) {
            System.out.println("hay numero par" );
        } else {
            System.out.println("no hay numero par");
        }

    }
    public static boolean determinarSiHayPar(int[] numeros) {
    boolean rta = false;
    for (int i = 0; i < numeros.length; i++) {

        if (numeros[i] % 2 == 0){rta = true;}

        }
    return  rta;
    }
}
