public class dos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(10 + 1);;
        int numeroUsuario = 0;
        int numeroIntentos = 5;

        String nombre = "gianluca";
        String apelido = "zeolla";

        System.out.println("adivina el numero del 1 al 10");
        System.out.println("tenes " + numeroIntentos + " intentos ");

        for (int intento = 1; intento <= numeroIntentos; intento++) {
            System.out.println("intento # " + intento + ": ingrese un numero: ");


            numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("felicidades "  + nombre + " " + apelido);
                break;
            } else if (numeroIntentos != intento) {
                System.out.println("incorrecto , intentalo devuelta " + nombre + " " + apelido );

            } else {
                System.out.println("estuviste cerca " + nombre + " " + apelido  + " este era el numero: "  + numeroAdivinar);
            }


        }
    }
}
