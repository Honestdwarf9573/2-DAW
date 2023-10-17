import java.util.Scanner;

//Hecho por Pedro González
import java.util.Scanner;


public class Ejercicio_6 {
    public static void main(String[] args) {
        //Declaramos las variables que se puedan declarar.
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        char letra;
        int indice=0;
        //Pedimos una cadena
        System.out.println("Dime una frase: ");
        cadena = teclado.nextLine();

        // Convertimos la cadena a minúsculas para que no haya errores
        cadena = cadena.toLowerCase();

        // Recorremos el alfabeto y contamos las veces que aparecen mediante un bucle for que va buscando en la frase cada palabra del abecedario y agregandola a su respectiva letra en las veces que aparece.
        System.out.println("Letras\t\tVeces que aparecen");
        for ( letra = 'a'; letra <= 'z'; letra++) {
            int contador = 0;
            indice = cadena.indexOf(letra);
            while (indice != -1) {
                contador++;
                indice = cadena.indexOf(letra, indice + 1);
            }
            System.out.println(letra + "\t\t" + contador);
        }
    }
}
