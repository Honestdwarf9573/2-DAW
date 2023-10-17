import java.util.Scanner;
//Hecho por Pedro González

public class Ejercicio_5{
    public static void main(String[]args){
        //Declaramos las variables
        Scanner teclado= new Scanner(System.in);
        String cadena="";
        char letra=' ';
        //Declaramos un contador para contar cuantas letras iguales que las que ponemos en nuestra variable hay en la frase
        int contador_caracter=0;
      
        //Preguntamos la cadena y el carácter
        System.out.println("Dime una frase");
        cadena=teclado.nextLine();
        System.out.println("Dime una letra");
        letra=teclado.next().charAt(0);
        //Declaramos esta variable despues de preguntar la letra para que no haya errores
          // Y creamos un indice para que guarde la posicion de la letra
        int indice_caracter= cadena.indexOf(letra);
        /*
         * Creamos un bucle que dice que mientras el indice es distinto de -1, suma al contador y vuelve a buscar la letra una posicion adelante.
         */
        while (indice_caracter!= -1){
            contador_caracter++;
            indice_caracter=cadena.indexOf(letra, indice_caracter+1);
        }
       System.out.println("En la frase "+cadena+" hay un total de "+contador_caracter+" letra/s de tipo "+letra);

    }


}