//Hecho por Pedro González
import java.util.Scanner;
public class Primera_Tarea_Pedro {
   
    
    //Pedir por teclado una cadena:
//Mostrar menú:
//Mostrarla al revés
//Contar el nº de vocales
//Contar el nº de consonantes
//Pasar todo a minúscula
//Pasar todo a mayúscula
//Decir si es palíndroma

    public static void main(String[]args){
        menu();

        
    }

    public static void menu(){
         //Declaramos variables
        Scanner teclado=new Scanner(System.in);
         String cadena="";
        byte opcion;
        String salida="";
        boolean salir=false;
         System.out.println("Pasame una cadena");
        cadena=teclado.nextLine();
        do {
             System.out.println("Bienvenido al menú:\nOpción 1:Mostrar la cadena al revés\nOpción 2: Contar el nº de vocales\nOpción 3: Contar el nº de consonantes\nOpción 4: Pasar todo a minúscula\nOpción 5:Pasar todo a mayúscula\nOpción 6:Comprobar si es palíndroma\nOpción 7: Salir");
        opcion=teclado.nextByte();
        switch(opcion){
                case 1:
                System.out.println("La cadena al revés es: " + alReves(cadena));
                System.out.println();
                break;
                case 2:
                    System.out.println("El número total de vocales es "+ contarVocales(cadena));
                    System.out.println();
                break;
                case 3:
                System.out.println("El número total de consonantes es "+ contarConsonantes(cadena));
                System.out.println();
               
                break;
                case 4:
                aMinuscula(cadena);
                System.out.println();
                break;
                case 5:
               aMayuscula(cadena);
               System.out.println();
                break;
                case 6:
                System.out.println("La cadena es palíndroma? " + comprobarPalindromo(cadena));
                System.out.println();
                break;
                case 7:
                do {
                    
                    System.out.println("Si desea salir escriba salir,en caso contrario volverá al menú");
                    teclado.nextLine();
                    salida=teclado.nextLine();
                    if(salida.equals("salir")){
                        System.out.println("Tenga un buen día");
                        salir=true;
                       break;
                       
                    }else{
                        break;
                    }
                } while (salida!="salir");
                break;
                default:
                System.out.println("Opción no válida");
                break;

        }
        } while (salir!=true);
       
    

    }

    public static String  alReves(String cadena){
       
        char letra=' ';
        String invertido="";
        System.out.println("Ha elegido mostrar la cadena al revés");
        System.out.println();
        for(int i=cadena.length() -1;i>=0;i--){
            letra=cadena.charAt(i);
            invertido+=letra;
        }
        return invertido;
    }

    public static int contarVocales(String cadena){
        int vocales=0;
        char letra=' ';
        System.out.println("Ha elegido contar el nº de vocales");
        System.out.println();
        for(int i=0;i<=cadena.length()-1;i++){
            letra=cadena.charAt(i);
            if(letra=='a' || letra=='e' || letra=='i'|| letra=='o'|| letra=='u'){
                vocales++;
            }
        }
           
            

        
        return vocales;
       

    }

     public static int contarConsonantes(String cadena){
        int consonantes=0;
        char letra=' ';
        System.out.println("Ha elegido contar el nº de consonantes");
        System.out.println();
        for(int i=0;i<=cadena.length()-1;i++){
            letra=cadena.charAt(i);
            if(letra!='a' && letra!='e' && letra!='i'&& letra!='o'&& letra!='u'){
                consonantes++;
            }
        }

        return consonantes;
       

    }

    public static void aMinuscula(String cadena){
        System.out.println("Ha elegido pasar todo a minúscula");
        System.out.println();
        System.out.println("La cadena a minúscula: "+cadena.toLowerCase());
    }

     public static void aMayuscula(String cadena){
        System.out.println("Ha elegido pasar todo a mayúscula");
        System.out.println();
        System.out.println("La cadena a mayúscula: "+cadena.toUpperCase());
    }

    public static boolean comprobarPalindromo(String cadena){
        char letra=' ';
        String invertido="";
        boolean palindromo=false;
        System.out.println("Ha elegido comprobar si la cadena es palíndroma");
        System.out.println();
        for(int i=cadena.length() -1;i>=0;i--){
            letra=cadena.charAt(i);
            invertido+=letra;
        }
        if(cadena.equals(invertido)){
            palindromo=true;
        }else{
            palindromo=false;
        }
        return palindromo;
    }
}
