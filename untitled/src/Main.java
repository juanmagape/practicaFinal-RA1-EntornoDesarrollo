import java.util.Scanner; // Importar Scanner

public class asd {

    public static void main(String[] args) throws InterruptedException {
        Scanner print = new Scanner(System.in); // Crear Scanner
        boolean bucle = true; // Control del bucle

        while (bucle) { // Bucle del menú principal
            // Mostrar menú
            System.out.println("\n=================== PRACTICA FINAL RA1 ===================\n");
            System.out.println("\n               Lista de programas a escoger\n");
            System.out.println("1 - Conversor de bases numéricas");
            System.out.println("2 - Simulador de dados");
            System.out.println("3 - Conversor de temperatura");
            System.out.println("4 - Calculador de edad");
            System.out.println("5 - Generador de saludos");
            System.out.println("6 - Salir");
            Thread.sleep(500); // Pausa de medio segundo

            System.out.println("Introduce el número del programa a escoger:");
            int eleccionPrograma = print.nextInt(); // Leer opción

            // Ejecutar el programa seleccionado
            switch (eleccionPrograma) {
                case 1:
                    ConversorBasesNumericas(print);
                    Thread.sleep(1000); // Pausa de 1 segundo
                    break;
                case 2:
                    SimuladorDados(print);
                    Thread.sleep(1000);
                    break;
                case 3:
                    ConversorTemperatura(print);
                    Thread.sleep(1000);
                    break;
                case 4:
                    CalculadorEdad(print);
                    Thread.sleep(1000);
                    break;
                case 5:
                    GeneradorSaludos(print);
                    Thread.sleep(1000);
                    break;
                case 6:
                    bucle = false; // Salir del bucle
                    System.out.println("Cerrando el programa");
                    break;
            }
        }
    }

    // Convierte un número decimal a binario y hexadecimal
    public static void ConversorBasesNumericas(Scanner print) throws InterruptedException {
        System.out.println("\n==================================");
        System.out.println("== Conversor de Bases Numéricas ==");
        System.out.println("==================================");
        System.out.print("Ingrese un número entero: ");
        int numeroDecimal = print.nextInt(); // Leer número

        System.out.println("\nnumeroDecimal = " + numeroDecimal);

        // Convertir a binario
        String resultadoBinario = "Número binario de " + numeroDecimal + " : " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        // Convertir a hexadecimal
        String resultadoHexadecimal = "Número hexadecimal de " + numeroDecimal + " : " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        Thread.sleep(3000); // Pausa de 3 segundos
    }

    // Simula el lanzamiento de dados
    public static void SimuladorDados(Scanner print) throws InterruptedException {
        System.out.println("\n==================================");
        System.out.println("======= Simulador de Dados =======");
        System.out.println("==================================");

        System.out.print("\nIngresa el número de dados que quieres tirar: ");
        Thread.sleep(500);

        int numDados = print.nextInt(); // Leer cantidad de dados

        System.out.println("\n==================================");
        System.out.println("=========== Resultados ===========");
        System.out.println("==================================");

        // Tirar cada dado
        for (int i = 0; i < numDados ; i++) {
            int contadorDados = i + 1;
            int dado = (int) (Math.random() * 6) + 1; // Número aleatorio del 1 al 6
            System.out.println("Dado " + contadorDados + ": " + dado);
        }
        Thread.sleep(3000);
    }

    // Calcula la edad según el año de nacimiento
    public static void CalculadorEdad(Scanner print) throws InterruptedException {
        System.out.println("\n=========================");
        System.out.println("== CALCULADORA DE EDAD ==");
        System.out.println("=========================\n");
        System.out.println("Introduce tu año de nacimiento:");

        int anyoNac = print.nextInt(); // Leer año
        int calculo = 2025 - anyoNac; // Calcular edad
        System.out.println("\nSi naciste en " + anyoNac + ", tienes " + calculo + " años\n");
        Thread.sleep(3000);
    }

    // Genera un saludo aleatorio personalizado
    public static void GeneradorSaludos(Scanner print) throws InterruptedException {
        System.out.println("\n=======================");
        System.out.println("== GENERADOR SALUDOS ==");
        System.out.println("=======================\n");
        System.out.println("Introduce tu nombre:");
        print.nextLine(); // Limpiar buffer
        String nombre = print.nextLine(); // Leer nombre

        int i = (int) (Math.random() * 5) + 1; // Elegir saludo aleatorio (1-5)

        // Mostrar saludo según el número aleatorio
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

    // Convierte temperaturas entre Fahrenheit y Celsius
    public static void ConversorTemperatura(Scanner print) throws InterruptedException {
        System.out.println("\n==========================");
        System.out.println("== CONVERSOR TEMPERATURA ==");
        System.out.println("===========================\n");

        System.out.println("\nQue conversión quieres hacer?");
        System.out.println("1 - Fahrenheit a Celsius");
        System.out.println("2 - Celsius a Fahrenheit\n");
        int eleccion = print.nextInt(); // Leer opción

        if (eleccion == 1) { // Fahrenheit a Celsius
            System.out.println("Introduce los grados Fahrenheit a convertir:");
            int fahrenheit = print.nextInt();

            int celsius = (fahrenheit - 32) * 5/9; // Fórmula de conversión
            System.out.println(celsius + " Grados Celsius");

        } else if (eleccion == 2) { // Celsius a Fahrenheit
            System.out.println("Introduce los grados celsius a convertir:");
            int celsius = print.nextInt();

            int fahrenheit = celsius * 9/5 + 32; // Fórmula de conversión
            System.out.println(fahrenheit + " Grados Fahrenheit");
        }
        Thread.sleep(3000);
    }
}