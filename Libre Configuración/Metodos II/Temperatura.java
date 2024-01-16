
//Hecho por Pedro Gonzalez
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Seleccione una opción:");
        System.out.println("1. Convertir de grados Fahrenheit a grados Centígrados");
        System.out.println("2. Convertir de grados Centígrados a grados Fahrenheit");
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
            double fahrenheit = teclado.nextDouble();
            double centigrados = centigrados(fahrenheit);
            System.out.println("La temperatura equivalente en grados Centígrados es: " + centigrados);
        } else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en grados Centígrados: ");
            double centigrados = teclado.nextDouble();
            double fahrenheit = fahrenheit(centigrados);
            System.out.println("La temperatura equivalente en grados Fahrenheit es: " + fahrenheit);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    // Este método devuelve la equivalencia en grados centigrados de una temperatura
    // en grados Fahrenheit.
    public static double centigrados(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    // Este método devuelve la equivalencia en grados Fahrenheit de una temperatura
    // en grados centigrados.
    public static double fahrenheit(double centigrados) {
        return 9.0 / 5.0 * centigrados + 32;
    }
}
