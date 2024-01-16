//Hecho por Pedro
public class Ej2 {
    // Método que verifica si un número es perfecto
    public static boolean esPerfecto(int numero) {
        int sumaFactores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaFactores += i;
            }
        }
        return sumaFactores == numero;
    }

    // Método que encuentra y muestra todos los números perfectos entre 1 y el límite especificado
    public static void encontrarNumerosPerfectos(int limite) {
        System.out.println("Números perfectos entre 1 y " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (esPerfecto(i)) {
                System.out.print(i + ": ");
                imprimirFactores(i);
            }
        }
    }

    // Método que imprime los factores de un número
    public static void imprimirFactores(int numero) {
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int limite = 10000;
        encontrarNumerosPerfectos(limite);
    }
}
