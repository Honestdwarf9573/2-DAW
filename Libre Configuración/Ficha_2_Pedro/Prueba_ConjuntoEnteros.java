public class Prueba_ConjuntoEnteros {
    public static void main(String[] args) {
        // Creamos los objetos
        ConjuntoEnteros conjunto1 = new ConjuntoEnteros();
        ConjuntoEnteros conjunto2 = new ConjuntoEnteros();

        //Insertamos elementos en los objetos
        conjunto1.insertarElemento(5);
        conjunto1.insertarElemento(10);
        conjunto1.insertarElemento(15);

        conjunto2.insertarElemento(10);
        conjunto2.insertarElemento(20);
        conjunto2.insertarElemento(25);

        // Probamis los métodos 
        System.out.println("Conjunto 1: " + conjunto1.aStringConjunto());
        System.out.println("Conjunto 2: " + conjunto2.aStringConjunto());

        System.out.println("¿El número 10 está en el conjunto 1?: " + conjunto1.esta(10));
        System.out.println("¿El número 20 está en el conjunto 2?: " + conjunto2.esta(20));

        ConjuntoEnteros union = ConjuntoEnteros.union(conjunto1, conjunto2);
        System.out.println("Unión de conjuntos: " + union.aStringConjunto());

        ConjuntoEnteros interseccion = ConjuntoEnteros.interseccion(conjunto1, conjunto2);
        System.out.println("Intersección de conjuntos: " + interseccion.aStringConjunto());

        System.out.println("¿El conjunto 1 es igual al conjunto 2?: " + conjunto1.esIgualA(conjunto2));
    }
}
