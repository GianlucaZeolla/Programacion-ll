//realizar un juego de 2 jugadores, adivinando del 1 al 10 un numero al azar, en 10 jugadas.
//condiciones: estructura de datos un Array. invariante de representacion, en las posiciones pares jugador 1, impares, jugador 2.
//tomamos el 0 como par
//1-indicar quien gano
//2-indicar si se acertaron todos los puntos
//3-indicar si se acerto algun punto
//----------------------
//0 true, 1 true,  2 false, 3 false, 4 false, 5 false, 6 false = empate
//0 false, 1 true, 2 false, 3 false, 4 false , 5 false, 6 false = gana jugador 2
public class tp {
    public static void main(String[] args) {
        boolean[] resultados = jugar();
        mostrar(resultados);
    }

    private static boolean[] jugar() {


    }

    private static void mostrar(boolean[] resultados) {
        System.out.println(ganador(resultados));
        System.out.println(asertadorTodos(resultados));
        System.out.println(asertadorPorLoMenosUno(resultados));
    }

    private static boolean asertadorTodos(boolean[] resultados) {
        return false;
    }

    public static boolean asertadorPorLoMenosUno(boolean[] resultados) {
    }

    private static String ganador(boolean[] resultados) {
        int puntosJugador1 = puntosJugador1(resultados);
        int puntosJugador2 = puntosJugador2(resultados);
        if (puntosJugador1==puntosJugador2){
            return "empate";
        } else if (puntosJugador1 > puntosJugador2) {
            return "gano jugador 1 ";
        } else {
            return "gano jugador 2";
        }
    }

    public static int puntosJugador2(boolean[] resultados) {
        int rta = 0;
        for (int i = 1; i < resultados.length; i=i+2){
            if (resultados[i]) rta++;
        }
        return rta;
    }

    private static int puntosJugador1(boolean[] resultados) {


        return 0;
    }

    private static int jugar() {
        return 0;
    }

}

