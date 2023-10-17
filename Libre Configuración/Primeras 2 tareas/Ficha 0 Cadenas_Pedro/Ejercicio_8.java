import java.util.Scanner;

//Hecho por Pedro González
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        String[] palabras;
        String cadena_nueva = "";

        System.out.println("Digame una frase, palabra, algo que no sea un número:");
        cadena = teclado.nextLine();

        // Convertimos la cadena a mayúsculas para evitar errores de comparación
        cadena = cadena.toUpperCase();

        // Separamos la cadena en palabras utilizando el método split()
        palabras = cadena.split(" ");

        // Recorremos las palabras y agregamos aquellas que comienzan con "ED" a la nueva cadena
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].startsWith("ED")) {
                cadena_nueva += palabras[i] + " ";
            }
        }

        System.out.println("Las palabras que comienzan con ED son: " + cadena_nueva);
    }
}
