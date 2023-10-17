import java.util.Scanner;
//Hecho por Pedro González

public class Ejercicio_4{
    public static void main(String[]args){
        //Declaramos las variables
        Scanner teclado= new Scanner(System.in);
        String cadena;
        //Preguntamos la cadena
        System.out.println("Dime una frase");
        cadena=teclado.nextLine();
    //Pasamos la cadena a minúsculas y mayúsculas

        System.out.println("");
        System.out.println(cadena.toLowerCase());
        System.out.println("");
        System.out.println(cadena.toUpperCase());
       

    }


}