//Hecho por Pedro González
import java.util.Scanner;

public class Ejercicio_16{
    public static void main(String[] args) {
        // Definir las variables que podamos
        Scanner teclado = new Scanner(System.in);
        String frase_morse = "";
        char c;
        int indice; 
        String frase_morse2;
        //Creamos dos arrays el del abecedario y el del morse
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                         'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                         '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                         '.', ',', ':', ';'};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                          ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                          "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                          "-----", ".----", "..---", "...--", "....-", ".....",
                          "-....", "--...", "---..", "----.",
                          ".-.-.-", "--..--", "---...", "-.-.-."};

      
        System.out.print("Digame una frase y se la paso a Morse");
        //Pasamos la frase a mayúscula para evitar complicaciones
        String frase = teclado.nextLine().toUpperCase();

        // Codificamos la frase a morse
        //En un bucle for si la frase tiene espacios la traduce en espacios tambien
        frase_morse = "";
        for (int i = 0; i < frase.length(); i++) {
             c = frase.charAt(i);
            if (c == ' ') {
                frase_morse += "   ";  //Dejamos tres espacios en blanco
            } else {
                //Usamos la funcion
                indice = buscarMorse(letras, c);
                if (indice != -1) {
                   frase_morse += morse[indice] + " ";  // Con esto dejamos espacios entre traduccion y traduccion
                }
            }
        }
        System.out.println("Frase en clave Morse: " + frase_morse);

        //Le preguntamos la frase en Morse
        System.out.print("Ingrese la frase en clave Morse: ");
        frase_morse2 = teclado.nextLine();

        // Decodificar la frase en clave Morse
        String frase2 = "";
        String[] palabras = frase_morse2.split("   ");  // Separar las palabras por tres espacios en blanco
        for (int i = 0; i < palabras.length; i++) {
            String[] letrasMorse = palabras[i].split(" ");  // Separar las letras por un espacio en blanco
            for (int j = 0; j < letrasMorse.length; j++) {
                 indice = buscarMorse(morse, letrasMorse[j]);
                if (indice != -1) {
                    frase2 += letras[indice];
                }
            }
            if (i != palabras.length - 1) {
                frase2 += " ";  // Un espacio en blanco entre palabras
            }
        }
        System.out.println("Frase decodificada: " + frase2);
    }

    // Función para buscar el índice de un elemento en un arreglo de caracteres o cadenas
    public static int buscarMorse(char[] array, char letra) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == letra) {
                return i;
            }
        }
        return -1;
    }
//Funcion sobrecargada 
    public static int buscarMorse(String[] array, String cadena) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(cadena)) {
                return i;
            }
        }
        return -1;
    }
}
