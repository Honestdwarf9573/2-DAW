import java.util.Scanner;
//Hecho por Pedro González

public class Ejercicio_3{
    public static void main(String[]args){
        //Declaramos las variables
        Scanner teclado= new Scanner(System.in);
        String cadena1;
        String cadena2;
        int resultado;
        //Preguntamos las frases
        System.out.println("Dime una frase");
        cadena1=teclado.nextLine();
        System.out.println("Dime otra frase");
        cadena2=teclado.nextLine();
        //Declaramos el resultado con compareTo
        resultado = cadena1.toLowerCase().compareTo(cadena2.toLowerCase());

        //Si resultado es menor que cero significa que la segunda cadena es mayor
        if(resultado<0){
            System.out.println("La primera cadena es menor que la segunda");
    
        }else if(resultado==0){
            //compareTo dara 0 si las cadenas son iguales
            System.out.println("Las cadenas son iguales");
        }else if(resultado>0){
          //Si resultado es mayor que cero significa que la primera cadena es mayor

            System.out.println("La primera cadena es mayor que la segunda");
        }
       

    }


}