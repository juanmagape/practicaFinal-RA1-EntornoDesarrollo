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
            Thread.sleep(500);

            System.out.println("Introduce el número del programa a escoger:");
            int eleccionPrograma = print.nextInt();

            switch (eleccionPrograma) {
                case 1:
                    ConversorBasesNumericas(print);
                    Thread.sleep(1000);
                    break;
                case 2:
                    SimuladorDados(print);
                    Thread.sleep(1000);
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

    public static void SimuladorDados(Scanner print) throws InterruptedException {
        System.out.println("\n==================================");
        System.out.println("======= Simulador de Dados =======");
        System.out.println("==================================");

        System.out.print("\nIngresa el número de dados que quieres tirar: ");
        Thread.sleep(500);

        int numDados = print.nextInt();

        System.out.println("\n==================================");
        System.out.println("=========== Resultados ===========");
        System.out.println("==================================");

        for (int i = 0; i < numDados ; i++) {
            int contadorDados = i + 1;
            int dado = (int) (Math.random() * 6) + 1;
            System.out.println("Dado " + contadorDados + ": " + dado);
        }
        Thread.sleep(3000);
    }

    public static void CalculadorEdad(Scanner print) throws InterruptedException {
        System.out.println("\n=======================");
        System.out.println("== CALCULADORA DE EDAD ==");
        System.out.println("=========================\n");
        System.out.println("Introduce tu año de nacimiento:");

        int anyoNac = print.nextInt();
        int calculo = 2025 - anyoNac;
        System.out.println("\nSi naciste en " + anyoNac + ", tienes " + calculo + " años\n");
        Thread.sleep(3000);
    }

    public static void GeneradorSaludos(Scanner print) throws InterruptedException {
        System.out.println("\n=====================");
        System.out.println("== GENERADOR SALUDOS ==");
        System.out.println("=======================\n");
        System.out.println("Introduce tu nombre:");
        String nombre = print.nextLine();

        int i = (int) (Math.random() * 5) + 1;
        switch (i) {
            case 1:
                System.out.println("¡Hola " + nombre + "! Bienvenido/a");
                break;
            case 2:
                System.out.println("¡Hola " + nombre + "! Espero que estés bien!");
                break;
            case 3:
                System.out.println("¡Bienvenido/a, " + nombre + "! Encantado de verte.");
                break;
            case 4:
                System.out.println("Saludos " + nombre + "! Espero que tengas un gran día.");
                break;
            case 5:
                System.out.println("¡Hey " + nombre + "! Gracias por venir.");
                break;
        }
        Thread.sleep(1000);

    }

    public static void ConversorTemperatura(Scanner print) throws InterruptedException {
        System.out.println("\n==========================");
        System.out.println("== CONVERSOR TEMPERATURA ==");
        System.out.println("===========================\n");

        System.out.println("\nQue conversión quieres hacer?");
        System.out.println("1 - Fahrenheit a Celsius");
        System.out.println("2 - Celsius a Fahrenheit\n");
        int eleccion = print.nextInt();

        if (eleccion == 1) {
            System.out.println("Introduce los grados Fahrenheit a convertir:");
            int fahrenheit = print.nextInt();

            int celsius = (fahrenheit - 32) * 5/9;
            System.out.println(celsius + " Grados Celsius");

        } else if (eleccion == 2) {
            System.out.println("Introduce los grados celsius a convertir:");
            int  celsius = print.nextInt();

            int fahrenheit = celsius * 9/5 + 32;
            System.out.println(fahrenheit + " Grados Fahrenheit");
        }
        Thread.sleep(3000);
    }
}