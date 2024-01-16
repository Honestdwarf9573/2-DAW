//Hecho por Pedro Gonzalez
import java.util.Scanner;

public class Ej_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número ");
        int num1 = teclado.nextInt();
        System.out.print("Ingresa otro número: ");
        int num2 = teclado.nextInt();

        System.out.print("Ingrese un número entre 1 y 99999: ");
        int num = teclado.nextInt();
        calcularCociente(num1, num2);
        calcularResiduo(num1, num2);
        mostrarDigitos(num);
    }

    // Este método muestra un número como una secuencia de dígitos separados por dos
    // espacios utilizando el método "mostrarDigitos".
    public static void mostrarDigitos(int num) {
        if (num >= 1 && num <= 99999) {
            String numString = String.valueOf(num);

            for (int i = 0; i < numString.length(); i++) {
                System.out.print(numString.charAt(i) + " ");

                if (i < numString.length() - 1) {
                    System.out.print(" ");
                }
            }
        } else {
            System.out.println("El número debe estar entre 1 y 99999.");
        }
    }

    public static void calcularCociente(int num1, int num2) {
        int parteEntera = num1 / num2;

        System.out.println("La parte entera del cociente es: " + parteEntera);
    }

    public static void calcularResiduo(int num1, int num2){

int residuoEntero = num1 %  num2;

System.out.println("El residuo entero es: " + residuoEntero);

    }
}
