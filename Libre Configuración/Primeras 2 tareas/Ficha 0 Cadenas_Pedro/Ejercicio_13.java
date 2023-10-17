import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        // Declaramos variables
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String linea = scanner.nextLine();
        int longitud;

        // Creamos el arrray de palabras y lo partimos
        String[] palabras = linea.split("\\s+");

        // Creamos otro array para almacenar palabras
        int[] contadorPalabras = new int[20];

       // Contar el número de palabras de cada longitud
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
                longitud = palabra.length();
                if (longitud > 0 && longitud <= 20) {
        contadorPalabras[longitud - 1]++;
    }
}


        // Creamos la tabla que muestra la longitud de palabras y las ocurrencias
        //Creamos una nueva variable todo el rato que vaya teniendo el valor de contadorPalabras cada bucle
        //Y creamos un bucle interno que vaya poniendo * por cada ocurrencia que encuentre
        System.out.println("Longitud de palabras y Ocurrencias:");
        for (int i = 0; i < 20; i++) {
             longitud = i + 1;
            int numeroPalabras = contadorPalabras[i];
            if (numeroPalabras > 0) {
                System.out.print(longitud + ": ");
                for (int j = 0; j < numeroPalabras; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
