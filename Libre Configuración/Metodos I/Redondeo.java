import java.util.Scanner;

public class Redondeo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita al usuario que ingrese un valor double
        System.out.print("Ingrese un valor double (0 para salir): ");
        double numero = teclado.nextDouble();

        // Mientras el usuario no ingrese 0, procesa cada número
        while (numero != 0) {
            // Redondea el número al entero más cercano utilizando la instrucción Math.floor
            double redondeado = Math.floor(numero + 0.5);

            // Muestra tanto el número original como el número redondeado
            System.out.println("Número original: " + numero);
            System.out.println("Número redondeado: " + redondeado);

            // Solicita al usuario que ingrese otro valor double
            System.out.print("Ingrese otro valor double (0 para salir): ");
            numero = teclado.nextDouble();
        }

        // Muestra un mensaje de despedida cuando el usuario ingresa 0 y finaliza el programa
        System.out.println("Fin del programa");
    }
}
