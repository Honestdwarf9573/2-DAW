//Hecho por Pedro Gonzalez
import java.util.Scanner;

public class Par {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese un número entero: ");
    int num = teclado.nextInt();

    if (esPar(num)) {
      System.out.println(num + " es par.");
    } else {
      System.out.println(num + " es impar.");
    }
  }

  // Este método determina si un número entero es par o impar utilizando el método "esPar".
  public static boolean esPar(int num) {
    return num % 2 == 0;
  }
}
