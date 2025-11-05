import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner print = new Scanner(System.in);

        boolean bucle = true;

        while (bucle) {
            System.out.println("\n=================== PRACTICA FINAL RA1 ===================\n");
            System.out.println("\n               Lista de programas a escoger\n");
            System.out.println("1 - Conversor de bases numéricas");
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
                    ConversorBasesNumericas(print);
                    Thread.sleep(1000);
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
    public static void ConversorBasesNumericas(Scanner print) throws InterruptedException {
        System.out.println("\n==================================");
        System.out.println("== Conversor de Bases Numéricas ==");
        System.out.println("==================================");
        System.out.print("Ingrese un número entero: ");
        int numeroDecimal = print.nextInt();

        System.out.println("\nnumeroDecimal = " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + " : " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        String resultadoHexadecimal = "Número hexadecimal de " + numeroDecimal + " : " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        Thread.sleep(3000);
    }

    public static void CalculadorEdad(Scanner print) throws InterruptedException {
        System.out.println("\n=================== CALCULADOR DE EDAD ===================\n");
        System.out.println("Introduce tu año de nacimiento");

        int anyoNac = print.nextInt();
        int calculo = 2025 - anyoNac;
        System.out.println("\nSi naciste en " + anyoNac + ", tienes " + calculo + " años\n");
        Thread.sleep(3000);
    }

}