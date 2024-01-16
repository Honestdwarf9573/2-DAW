//Hecho por Pedro
// Importar las clases necesarias
import java.util.Random;
import java.util.Scanner;

// Clase principal
public class Ej4 {
    public static void main(String[] args) {
        // Crear objetos Scanner y Random
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        // Variable para controlar si se juega de nuevo
        boolean jugarDeNuevo = true;

        // Mensaje de bienvenida
        System.out.println("Juego de Adivina el Número");
        System.out.println("--------------------------");

        // Bucle para permitir jugar de nuevo
        while (jugarDeNuevo) {
            // Generar un número aleatorio para adivinar
            int numeroAdivinar = random.nextInt(100) + 1;
            int intentos = 0;
            boolean adivinado = false;

            // Mensaje para ingresar un número
            System.out.println("Adivina un número entre 1 y 100");

            // Bucle para solicitar intentos hasta adivinar el número
            while (!adivinado) {
                System.out.print("Intento #" + (intentos + 1) + ": ");
                int intento = teclado.nextInt();
                teclado.nextLine();

                // Verificar si el número adivinado es correcto
                if (intento == numeroAdivinar) {
                    System.out.println("¡Felicidades! ¡Adivinaste el número!");
                    adivinado = true;
                } else if (intento < numeroAdivinar) {
                    System.out.println("Demasiado bajo. Intenta de nuevo.");
                } else {
                    System.out.println("Demasiado alto. Intenta de nuevo.");
                }

                intentos++;
            }

            // Preguntar si se desea jugar de nuevo
            System.out.println("¿Deseas jugar de nuevo? (s/n)");
            String opcion = teclado.nextLine();

            if (!opcion.equalsIgnoreCase("s")) {
                jugarDeNuevo = false;
            }

            System.out.println("--------------------------");
        }

        // Mensaje de finalización
        System.out.println("Gracias por jugar.");
    }
}
