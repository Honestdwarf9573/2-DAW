import java.util.Scanner;

public class Ej1 {
    // Método para convertir Fahrenheit a Celsius
    public static int fahrenheitACelsius(int fahrenheit) {
        int celsius = (int) ((5.0 / 9.0) * (fahrenheit - 32));
        return celsius;
    }

    // Método para convertir Celsius a Fahrenheit
    public static int celsiusAFahrenheit(int celsius) {
        int fahrenheit = (int) ((9.0 / 5.0) * celsius + 32);
        return fahrenheit;
    }

    // Método principal para convertir temperatura
    public static void convertirTemperatura() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una temperatura: ");
        int temperatura = teclado.nextInt();
        System.out.print("Ingrese la unidad de la temperatura (F o C): ");
        String unidad = teclado.next();

        if (unidad.equalsIgnoreCase("F")) {
            int celsius = fahrenheitACelsius(temperatura);
            System.out.println(temperatura + " grados Fahrenheit son equivalentes a " + celsius + " grados Celsius.");
        } else if (unidad.equalsIgnoreCase("C")) {
            int fahrenheit = celsiusAFahrenheit(temperatura);
            System.out.println(temperatura + " grados Celsius son equivalentes a " + fahrenheit + " grados Fahrenheit.");
        } else {
            System.out.println("La unidad ingresada no es válida.");
        }
    }

    public static void main(String[] args) {
        // Llamada al método para convertir temperatura
        convertirTemperatura();
    }
}
