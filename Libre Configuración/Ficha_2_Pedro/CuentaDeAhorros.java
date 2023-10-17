public class CuentaDeAhorros {
    // Creamos la variable estática y el saldo de ahorros
    protected static double tasaInteresAnual;
    private double saldoAhorros;

    // Constructor por defecto
    public CuentaDeAhorros() {

    }

    // Constructor con el saldo de ahorros
    public CuentaDeAhorros(double saldoAhorros) {

        this.saldoAhorros = saldoAhorros;
    }

    // Métodos get y set
    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    // Método que modifica la tasa de intereses
    public static void modificarTasaIntereses(double tasaIntereses) {
        tasaInteresAnual = tasaIntereses;
    }

    // Método que calcula el interés mensual
    public void calcularInteresMensual() {
        this.saldoAhorros = this.saldoAhorros + (this.saldoAhorros * (tasaInteresAnual / 12));
    }
}