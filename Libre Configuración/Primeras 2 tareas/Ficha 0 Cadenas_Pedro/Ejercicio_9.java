//Hecho por Pedro González
import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        //Declaramos las variables

        Scanner teclado = new Scanner(System.in);
        int codigo;
        char letra;
        System.out.print("Pon un código y yo te devuelvo una letra/carácter: ");
        codigo = teclado.nextInt();
        //Hacemos un casting a char para traducir el int a char
         letra = (char) codigo;
         //Devolvemos la letra con un toString.
        System.out.println("El carácter correspondiente es: " + Character.toString(letra));
    }
}
