public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor que recibe tres valores enteros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Constructor que recibe un objeto String y dos valores enteros
    public Fecha(String mesString, int dia, int año) {
        this.dia = dia;
        this.año = año;
        this.mes = convertirMesStringAMesNumérico(mesString);
    }

    // Constructor que recibe dos valores enteros, el primero representa el número de día en el año
    public Fecha(int díaDelAño, int año) {
        this.año = año;
        // Lógica para calcular el mes y el día a partir del día del año
        // ...
    }

    // Método para imprimir la fecha en formato MM/DD/AAAA
    public void imprimirFechaEnFormato1() {
        System.out.printf("%02d/%02d/%04d%n", mes, dia, año);
    }

    // Método para imprimir la fecha en formato Junio 15, 1992
    public void imprimirFechaEnFormato2() {
        String nombreMes = convertirMesNuméricoAMesString(mes);
        System.out.printf("%s %d, %04d%n", nombreMes, dia, año);
    }

    // Método privado para convertir el nombre del mes a un valor numérico
    private int convertirMesStringAMesNumérico(String mesString) {
        int mesNumérico = 0; // Valor por defecto si no se encuentra una coincidencia

        // Comparar las cadenas usando el método equals
        if (mesString.equals("Enero")) {
            mesNumérico = 1;
        } else if (mesString.equals("Febrero")) {
            mesNumérico = 2;
        } else if (mesString.equals("Marzo")) {
            mesNumérico = 3;
        } else if (mesString.equals("Abril")) {
            mesNumérico = 4;
        } else if (mesString.equals("Mayo")) {
            mesNumérico = 5;
        } else if (mesString.equals("Junio")) {
            mesNumérico = 6;
        } else if (mesString.equals("Julio")) {
            mesNumérico = 7;
        } else if (mesString.equals("Agosto")) {
            mesNumérico = 8;
        } else if (mesString.equals("Septiembre")) {
            mesNumérico = 9;
        } else if (mesString.equals("Octubre")) {
            mesNumérico = 10;
        } else if (mesString.equals("Noviembre")) {
            mesNumérico = 11;
        } else if (mesString.equals("Diciembre")) {
            mesNumérico = 12;
        }

        return mesNumérico;
    }

    // Método privado para convertir el valor numérico del mes a su nombre correspondiente
    private String convertirMesNuméricoAMesString(int mesNumérico) {
        String nombreMes = ""; // Valor por defecto si no se encuentra una coincidencia

        switch (mesNumérico) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
        }

        return nombreMes;
    }
}
