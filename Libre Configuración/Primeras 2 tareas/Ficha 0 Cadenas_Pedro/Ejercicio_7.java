import java.util.Scanner;

//Hecho por Pedro González
public class Ejercicio_7 {
    public static void main(String[]args){
        //Declaramos las variables
        Scanner teclado=new Scanner(System.in);
        String cadena=new String("Hola");
        String cadena_nueva="";
        //Creamos esta variable letra para comparar 
        char letra='b';
        char auxiliar;
        System.out.println("Digame una frase,palabra, algo que no sea un número");
        cadena=teclado.nextLine();
        //Creamos un bucle y vamos recorriendo todas las letras del bucle
        //En la cadena nueva sustituimos todo lo que no sea b por espacios
        for(int i=0;i<cadena.length();i++){
        auxiliar=cadena.charAt(i);
        if(auxiliar!=letra){
            cadena_nueva += " ";
        }else{
            cadena_nueva += auxiliar;

        }
        }
        System.out.println(cadena_nueva);
    }
}
