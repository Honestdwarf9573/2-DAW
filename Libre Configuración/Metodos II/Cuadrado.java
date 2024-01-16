//Hecho por Pedro Gonzalez
import java.util.Scanner;

public class Cuadrado {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese el lado del cuadrado: ");
    int lado = teclado.nextInt();

    System.out.print("Ingrese el caracter de relleno: ");
    char caracterRelleno = teclado.next().charAt(0);

    cuadradoDeAsteriscos(lado, caracterRelleno);
  }

  // Este método muestra un cuadrado relleno de asteriscos o cualquier otro caracter especificado por el usuario utilizando el método "cuadradoDeAsteriscos".
  public static void cuadradoDeAsteriscos(int lado, char caracterRelleno) {
    for (int i = 1; i <= lado; i++) {
      for (int j = 1; j <= lado; j++) {
        System.out.print(caracterRelleno + " ");
      }
      System.out.println();
    }
  }
}
