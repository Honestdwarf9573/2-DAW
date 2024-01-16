//Hecho por Pedro
import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        // Crear un objeto Random para generar valores aleatorios
        Random random = new Random();

        // Variables para contar el número de caras y cruces
        int caras = 0;
        int cruces = 0;

        System.out.println("Simulación de lanzamiento de monedas");
        System.out.println("------------------------------------");

        // Bucle para permitir al usuario lanzar la moneda
        while (true) {
            System.out.println("Presione Enter para lanzar la moneda o escriba 'salir' para terminar");
            String opcion = teclado.nextLine();

            // Verificar si el usuario desea salir del programa
            if (opcion.equalsIgnoreCase("salir")) {
                break;
            }

            // Lanzar la moneda y obtener el resultado
            boolean resultado = tirar(random);
            if (resultado) {
                System.out.println("Cruz");
                cruces++;
            } else {
                System.out.println("Cara");
                caras++;
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Resultados:");
        System.out.println("Caras: " + caras);
        System.out.println("Cruces: " + cruces);
    }

    // Método para lanzar la moneda y devolver el resultado (true para cruz, false para cara)
    public static boolean tirar(Random random) {
        return random.nextBoolean();
    }
}
