public class ConjuntoEnteros {
    private boolean[] conjunto;

    public ConjuntoEnteros() {
        conjunto = new boolean[101]; // Poner el rango de 0 a 100
    }

    public boolean esta(int numero) {
        if (numero < 0 || numero > 100) {
            return false;
        }
        return conjunto[numero];
    }

    public void insertarElemento(int numero) {
        if (numero >= 0 && numero <= 100) {
            conjunto[numero] = true;
        }
    }

    public void eliminarElemento(int numero) {
        if (numero >= 0 && numero <= 100) {
            conjunto[numero] = false;
        }
    }

    public String aStringConjunto() {
        StringBuilder sb = new StringBuilder();
        boolean vacio = true;

        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
                vacio = false;
            }
        }

        if (vacio) {
            return "---"; // Conjunto vacío
        } else {
            return sb.toString().trim();
        }
    }

    public boolean esIgualA(ConjuntoEnteros otroConjunto) {
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] != otroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

    public static ConjuntoEnteros union(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2) {
        ConjuntoEnteros union = new ConjuntoEnteros();

        for (int i = 0; i < conjunto1.conjunto.length; i++) {
            union.conjunto[i] = conjunto1.conjunto[i] || conjunto2.conjunto[i];
        }

        return union;
    }

    public static ConjuntoEnteros interseccion(ConjuntoEnteros conjunto1, ConjuntoEnteros conjunto2) {
        ConjuntoEnteros interseccion = new ConjuntoEnteros();

        for (int i = 0; i < conjunto1.conjunto.length; i++) {
            interseccion.conjunto[i] = conjunto1.conjunto[i] && conjunto2.conjunto[i];
        }

        return interseccion;
    }
}
