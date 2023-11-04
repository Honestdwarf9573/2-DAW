import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicita al usuario que ingrese la base y el exponente
        System.out.print("Ingrese la base: ");
        int base = teclado.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = teclado.nextInt();

        // Calcula la potencia utilizando el método enteroPotencia
        int resultado = enteroPotencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);

        // Calcula la potencia utilizando el método enteroPotenciaRecursivo
        int resultadoRecursivo = enteroPotenciaRecursivo(base, exponente);
        System.out.println("El resultado (recursivo) de " + base + " elevado a " + exponente + " es: " + resultadoRecursivo);
    }

    // Método para calcular la potencia utilizando un ciclo for
    public static int enteroPotencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    // Método para calcular la potencia de forma recursiva
    public static int enteroPotenciaRecursivo(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * enteroPotenciaRecursivo(base, exponente - 1);
        }
    }
}
