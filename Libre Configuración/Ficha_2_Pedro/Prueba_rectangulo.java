//Hecho por Pedro González
import java.util.Scanner;


public class Prueba_rectangulo {

    public static void main(String[]args){
//Creamos el objeto

Rectangulo r1;
r1=new Rectangulo();
//Mostramos la anchura y longitud
System.out.println("Mostramos la anchura y la longitud actual "+r1.anchura+" y "+r1.longitud);


System.out.println();
//Calculamos el área
r1.calcularArea();
//Mostramos el resultado
System.out.println("El área de un rectágulo es: "+r1.longitud);
//Calculamos el perímetro
r1.calcularPerimetro();
//Mostramos el resultado
System.out.println("El perímetro de un rectángulo es: "+r1.longitud);

//Cambiamos de valor la anchura 
r1.obtenerAnchura(20.0);
//Comprobamos que este dentro de los límites
System.out.println("La anchura está dentro de los límites establecidos? "+r1.establecerAnchura());


//Cambiamos de valor la longitud
r1.obtenerLongitud(5.5);
//Comprobamos que este dentro de los límites
System.out.println("La longitud está dentro de los límites establecidos? "+r1.establecerLongitud());
    }
}
