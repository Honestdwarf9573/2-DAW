import java.util.Scanner;

public class VentasTotales {

    public static void main(String[] args) {
        
        // Crear un array bidimensional para almacenar las ventas totales por vendedor y por producto
        double[][] ventas = new double[6][5]; // Se intercambian las dimensiones
        
        // Leer la información de las notas de venta del mes pasado y procesarla para calcular los totales
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número del vendedor (1-4): ");
            int vendedor = input.nextInt();
            System.out.print("Ingrese el número del producto (1-5): ");
            int producto = input.nextInt();
            System.out.print("Ingrese el valor total en euros de ese producto vendido en ese día: ");
            double valor = input.nextDouble();
            ventas[vendedor - 1][producto - 1] += valor;
        }
        
        
      
// Imprimir los resultados en formato tabular
System.out.printf("%10s%10s%10s%10s%10s%10s%10s\n", "", "Vendedor 1", "Vendedor 2", "Vendedor 3", "Vendedor 4", "Total", "Promedio");
for (int i = 0; i < 5; i++) {
    double total = 0;
    for (int j = 0; j < 4; j++) {
        total += ventas[j][i];
        System.out.printf("%10s%10.2f ", "Producto " + (i+1), ventas[j][i]);
    }
    System.out.printf("%10.2f%10.2f\n", total, total / 4);
}


// Calcular y mostrar las ventas totales de cada vendedor durante el último mes
System.out.printf("%10s", "");
for (int j = 0; j < 4; j++) { // Modificar el límite superior del bucle
    double total = 0;
    for (int i = 0; i < 5; i++) { // Modificar el límite superior del bucle
        total += ventas[j][i];
    }
    System.out.printf("%10.2f", total);
}


}

}
