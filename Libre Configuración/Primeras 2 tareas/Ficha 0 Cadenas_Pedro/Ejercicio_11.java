//Hecho por Pedro González
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        //Declaramos variables
          Scanner teclado=new Scanner(System.in);
          String cadena;
           char caracter;
           int indice1;
           int indice2;
           //Preguntamos al usuario
        System.out.println("Dime una frase");
        cadena=teclado.nextLine();
        System.out.println("Dime un carácter que quieras buscar");
        caracter=teclado.next().charAt(0);
      
       //Los metodos creados en funciones
        indice1 = indexOf(cadena, caracter);
        indice2 = lastIndexOf(cadena, caracter);
        System.out.println(" En el método indexOf: " + indice1);
        System.out.println("En el método lastIndexOf: " + indice2);
    }
    //El método de indexOf consiste en un bucle for que busca la posicion del caracter en la cadena y devuelve la posicion numerica
    //En caso de no encontrarlo devuelve -1
    public static int indexOf(String cadena, char caracter) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                return i;
            }
        }
        return -1;
    }
//El método de lastIndexOf es lo mismo pero al revés 
    public static int lastIndexOf(String cadena, char caracter) {
        for (int i = cadena.length() - 1; i >= 0; i--) {
            if (cadena.charAt(i) == caracter) {
                return i;
            }
        }
        return -1;
    }
}
