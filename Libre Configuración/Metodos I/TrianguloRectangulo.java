import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        // Triángulo 1: Lado1 = 0, Lado2 = 0
        double lado1Triangulo1 = 0.0;
        double lado2Triangulo1 = 0.0;
        double hipotenusaTriangulo1 = hipotenusa(lado1Triangulo1, lado2Triangulo1);
        System.out.println("Triángulo 1 - Hipotenusa: " + hipotenusaTriangulo1);

        // Triángulo 2: Lado1 = 0, Lado2 = 12.0
        double lado1Triangulo2 = 0.0;
        double lado2Triangulo2 = 12.0;
        double hipotenusaTriangulo2 = hipotenusa(lado1Triangulo2, lado2Triangulo2);
        System.out.println("Triángulo 2 - Hipotenusa: " + hipotenusaTriangulo2);

        // Triángulo 3: Lado1 = 8.0, Lado2 = 15.0
        double lado1Triangulo3 = 8.0;
        double lado2Triangulo3 = 15.0;
        double hipotenusaTriangulo3 = hipotenusa(lado1Triangulo3, lado2Triangulo3);
        System.out.println("Triángulo 3 - Hipotenusa: " + hipotenusaTriangulo3);
    }

    // Método para calcular la hipotenusa de un triángulo rectángulo
    public static double hipotenusa(double lado1, double lado2) {
        double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        return hipotenusa;
    }
}
