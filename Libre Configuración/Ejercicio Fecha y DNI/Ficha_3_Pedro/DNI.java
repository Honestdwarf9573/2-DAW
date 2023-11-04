public class DNI {
    private int numeroDni; // Atributo privado que almacena el número de DNI sin la letra

    /**
     * Constructor de la clase. Recibe un número de DNI como argumento y comprueba que sea válido.
     * Lanza una excepción si el número de DNI es inválido.
     */
    public DNI(int numeroDni) throws Exception {
        if (numeroDni < 0 || numeroDni > 99999999) {
            throw new Exception("El número de DNI es inválido");
        }
        this.numeroDni = numeroDni;
    }

    /**
     * Método que devuelve el número de DNI sin la letra.
     */
    public int getNumeroDni() {
        return numeroDni;
    }

    /**
     * Método que devuelve el NIF completo (número y letra).
     */
    public String getNif() {
        return numeroDni + calcularLetraNIF(numeroDni);
    }

    /**
     * Método que modifica el número de DNI a partir de un NIF completo. Lanza una excepción si el NIF es inválido.
     */
    public void setDni(String nif) throws Exception {
        if (!validarNif(nif)) {
            throw new Exception("El NIF proporcionado es inválido");
        }
        numeroDni = extraerNumeroDni(nif);
    }

    /**
     * Método que modifica el número de DNI a partir de un número de DNI sin letra. Lanza una excepción si el número de DNI es inválido.
     */
    public void setDni(int numeroDni) throws Exception {
        if (numeroDni < 0 || numeroDni > 99999999) {
            throw new Exception("El número de DNI es inválido");
        }
        this.numeroDni = numeroDni;
    }

    /**
     * Método privado que calcula la letra correspondiente a un número de DNI.
     */
    private static char calcularLetraNIF(int numeroDni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = numeroDni % 23;
        return letras.charAt(indice);
    }

    /**
     * Método privado que valida un NIF completo.
     */
    private static boolean validarNif(String nif) {
        if (nif.length() != 9) {
            return false;
        }
        int numeroDni = extraerNumeroDni(nif);
        char letraCalculada = calcularLetraNIF(numeroDni);
        char letraNif = extraerLetraNif(nif);
        return letraCalculada == letraNif;
    }

    /**
     * Método privado que extrae la letra del NIF completo.
     */
    private static char extraerLetraNif(String nif) {
        return nif.charAt(8);
    }

    /**
     * Método privado que extrae el número de DNI sin letra del NIF completo.
     */
    private static int extraerNumeroDni(String nif) {
        return Integer.parseInt(nif.substring(0, 8));
    }
}
