//Hecho por Pedro González
//Metemos todas las importaciones para ayudar con el ejercicio
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        //Declaramos las variables
        Scanner teclado= new Scanner(System.in);
        String fecha_cadena;
        SimpleDateFormat formatoEntrada;
        SimpleDateFormat formatoSalida;
          String fechaFormateada;
        Date fecha;
        //Ingresamos una fecha y con un try catch comprobamos y formateamos el texto a fecha.
        System.out.print("Ingresa una fecha en formato dd/MM/yyyy: ");
        fecha_cadena = teclado.nextLine();
         formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");
          
       formatoSalida = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        try {
             fecha = formatoEntrada.parse(fecha_cadena);
             fechaFormateada = formatoSalida.format(fecha);
            System.out.println(fechaFormateada);
        } catch (ParseException e) {
            System.out.println("Fecha inválida. Inténtalo de nuevo.");
        }
    }
}
