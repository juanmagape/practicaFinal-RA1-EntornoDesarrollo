import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner print = new Scanner(System.in);

        boolean bucle = true;

        while (bucle) {
            System.out.println("\n=================== PRACTICA FINAL RA1 ===================\n");
            System.out.println("\n               Lista de programas a escoger\n");
            System.out.println("1 - Generador de números aleatorio");
            System.out.println("2 - Simulador de dados");
            System.out.println("3 - Conversor de temperatura");
            System.out.println("4 - Calculador de edad");
            System.out.println("5 - Generador de saludos");
            System.out.println("6 - Salir");
            Thread.sleep(3000);

            System.out.println("Introduce el número del programa a escoger");
            int eleccionPrograma = print.nextInt();

            switch (eleccionPrograma) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    bucle = false;
                    System.out.println("Cerrando el programa");
                    break;
            }
        }
    }
}