import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double totalRecibos = 0.0;

        // Solicita al usuario el número de clientes que estacionaron ayer
        System.out.print("Ingrese el número de clientes: ");
        int numClientes = teclado.nextInt();

        // Itera a través de cada cliente y calcula su pago
        for (int i = 1; i <= numClientes; i++) {
            // Solicita al usuario las horas de estacionamiento para el cliente actual
            System.out.print("Ingrese las horas de estacionamiento para el cliente " + i + ": ");
            int horasEstacionamiento = teclado.nextInt();

            // Calcula el pago para el cliente actual utilizando el método calcularPagos
            double pago = calcularPagos(horasEstacionamiento);

            // Muestra el pago para el cliente actual
            System.out.println("El pago para el cliente " + i + " es: " + pago + " euros");

            // Agrega el pago del cliente actual al total de recibos
            totalRecibos += pago;
        }

        // Muestra el total de los recibos de ayer
        System.out.println("El total de los recibos de ayer es: " + totalRecibos + " euros");
    }

    // Método que calcula el pago para un solo cliente
    public static double calcularPagos(int horasEstacionamiento) {
        double pago = 2.00;

        // Si las horas de estacionamiento son más de 3, se cobra un cargo adicional por horas extra
        if (horasEstacionamiento > 3) {
            int horasExtra = horasEstacionamiento - 3;
            double pagoExtra = horasExtra * 0.50;

            // Si el cargo adicional es mayor a 7.00 euros, se establece un límite de 7.00 euros como máximo
            if (pagoExtra > 7.00) {
                pagoExtra = 7.00;
            }

            // Agrega el cargo adicional al pago total
            pago += pagoExtra;
        }

        // Si el pago total es mayor a 10.00 euros, se establece un límite de 10.00 euros como máximo
        if (pago > 10.00) {
            pago = 10.00;
        }

        // Retorna el pago total para el cliente actual
        return pago;
    }
}
