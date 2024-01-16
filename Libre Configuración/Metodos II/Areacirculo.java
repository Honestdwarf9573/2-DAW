//Hecho por Pedro Gonzalez
import java.util.Scanner;

public class Areacirculo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese el radio del círculo: ");
    double radio = teclado.nextDouble();

    double area = circuloArea(radio);

    System.out.println("El área del círculo es: " + area);
  }

  // Este método calcula el área de un círculo utilizando la fórmula A = πr^2.
  public static double circuloArea(double radio) {
    return Math.PI * Math.pow(radio, 2);
  }
}
