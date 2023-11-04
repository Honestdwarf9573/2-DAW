import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita al usuario que ingrese los pares de enteros
        System.out.print("Ingrese el primer entero (0 para salir): ");
        int entero1 = teclado.nextInt();

        while (entero1 != 0) {
            System.out.print("Ingrese el segundo entero: ");
            int entero2 = teclado.nextInt();

            // Determina si el segundo entero es múltiplo del primero utilizando el método multiplo
            boolean esMultiplo = multiplo(entero1, entero2);

            if (esMultiplo) {
                System.out.println(entero2 + " es múltiplo de " + entero1);
            } else {
                System.out.println(entero2 + " no es múltiplo de " + entero1);
            }

            System.out.print("Ingrese el primer entero (0 para salir): ");
            entero1 = teclado.nextInt();
        }

        System.out.println("Fin del programa");
    }

    // Método para determinar si un entero es múltiplo de otro
    public static boolean multiplo(int entero1, int entero2) {
        if (entero2 % entero1 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
