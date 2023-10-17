//Hecho por Pedro González
import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        //Declaramos variables
         double cantidad;
          Scanner teclado = new Scanner(System.in);
         String cadena_cantidad;
          int longitud;
          int asteriscos ;
        // Le preguntamos la cantidad al usuario
       
        System.out.print("Ingrese la cantidad del cheque: ");
        cantidad = teclado.nextDouble();

        // Pasamos el double a String
         cadena_cantidad = String.format("%.2f", cantidad);

        // Metemos la longitud del valor en una variable
        longitud = cadena_cantidad.length();

        // Le ponemos los asteriscos necesarios
         asteriscos = 9 - longitud;

        //Imprimimos los asteriscos
        if ( asteriscos > 0) {
            for (int i = 0; i <  asteriscos; i++) {
                System.out.print("*");
            }
        }
        //Mostramos la cantidad
        System.out.print(cadena_cantidad);
    }
}
