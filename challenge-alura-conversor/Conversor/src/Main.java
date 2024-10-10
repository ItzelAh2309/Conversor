import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EXTERNA:
        while (true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida: ");
            System.out.println("*********************************");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch (opcion){
                case '1':
                    convertir(974.80, "Peso argentino");
                    break;
                case '2':
                    convertir(0.0010, "Dólar");
                    break;
                case '3':
                    convertir(5.60, "Real brasileño");
                    break;
                case '4':
                    convertir(0.18, "Dólar");
                    break;
                case '5':
                    convertir(4234.49, "Peso colombiano");
                    break;
                case '6':
                    convertir(0.00024, "Dólar");
                    break;
                case '7':
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break EXTERNA;
                default:
                    System.out.println("Opción no valida");

            }

        }
    }

    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor que deseas convertir: ");
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda * valorDolar;

       // dolares = (double) Math.round(dolares * 100d)/100;

        System.out.println("-------------------------------");
        System.out.println("|Tienes $"+dolares+"          |");
        System.out.println("-------------------------------");
    }
}