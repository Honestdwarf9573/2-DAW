//Hecho por Pedro González
import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        //Declaramos variables
        Scanner teclado = new Scanner(System.in);
        String texto;
       
        int[] contadorLetras = new int[26];
         System.out.print("Dime una frase ");
        texto = teclado.nextLine();
        //Creamos un bucle que vaya buscando ocurrencias y que las vaya metiendo en el array
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (Character.isLetter(caracter)) {
                int indice = Character.toLowerCase(caracter) - 'a';
                contadorLetras[indice]++;
            }
        }
        //Y luego mostramos el array enseñando cuantas letras ha habido en la frase
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i);
            System.out.println(letra + ": " + contadorLetras[i]);
        }
    }
}
