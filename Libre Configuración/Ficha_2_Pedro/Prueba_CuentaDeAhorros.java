public class Prueba_CuentaDeAhorros {

    public static void main(String[] args) {
        // Creamos los objetos
        // Y ponemos la tasa un 4%
        CuentaDeAhorros.modificarTasaIntereses(0.04);
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000);
        // Calculamos el Interés Mensual de las 2
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Saldo de ahorrador1 después del primer mes: " + ahorrador1.getSaldoAhorros());
        System.out.println("Saldo de ahorrador2 después del primer mes: " + ahorrador2.getSaldoAhorros());
        // Modificamos al 5% el interés anual
        CuentaDeAhorros.modificarTasaIntereses(0.05);
        // Volvemos a calcular
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Saldo de ahorrador1 después del segundo mes: " + ahorrador1.getSaldoAhorros());
        System.out.println("Saldo de ahorrador2 después del segundo mes: " + ahorrador2.getSaldoAhorros());
    }

}