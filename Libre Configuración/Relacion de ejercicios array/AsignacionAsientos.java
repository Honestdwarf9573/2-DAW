import java.util.Scanner;

public class AsignacionAsientos {

    public static void main(String[] args) {
        boolean[] asientos = new boolean[10];
        Scanner teclado = new Scanner(System.in);

        // Inicializar todos los asientos como vacíos
        for (int i = 0; i < asientos.length; i++) {
            asientos[i] = false;
        }

        int opcion;
        do {
            //Preguntamos el asiento
            System.out.println("Por favor escriba 1 para Primera clase y por favor escriba 2 para Económico:");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                        // Asignamos asiento en la Primera Clase
                int asiento = asignarAsiento(asientos, 1, 5);
                if (asiento != -1) {
                    //Le mostramos el asiento
                    System.out.println("Tu asiento de Primera Clase es el número : " + asiento);
                    mostrarTarjeta(asiento, "Primera Clase");
                } else {
                    //Si no hay ningun asiento libre
                    System.out.println("Lo siento,no hay asientos disponibles.");
                    System.out.println("¿Desea elegir la clase Económica? Presione 1 para Sí, 2 para No.");
                    opcion = teclado.nextInt();
                    if (opcion == 1) {
                //Asignamos asientos de clase Económica
                        asiento = asignarAsiento(asientos, 6, 10);
                        if (asiento != -1) {
                            //Mostramos la tarjetas
                            System.out.println("Tu asiento de la clase Económica es el número: " + asiento);
                            mostrarTarjeta(asiento, "Clase Económica");
                        } else {
                            //Como todos los asientos estan vacios le avisamos que el proximo vuelo sale en 3 horas
                            System.out.println("Lo siento, todos los asientos están ocupados.");
                            System.out.println("El próximo vuelo sale en 3 horas.");
                        }
                    }
                }
            } else if (opcion == 2) {
                //Si elige la opcion 2 de primeras hacemos lo mismo al reves
                //Asignamos asientos de clase Económica
                int asiento = asignarAsiento(asientos, 6, 10);
                if (asiento != -1) {
                    System.out.println("Tu asiento de la clase Económica es el número: " + asiento);
                    mostrarTarjeta(asiento, "Clase Económica");
                } else {
                    System.out.println("Lo siento, todos los asientos están ocupados.");
                    System.out.println("¿Desea elegir Primera Clase? Presione 1 para Sí, 2 para No.");
                    opcion = teclado.nextInt();
                    if (opcion == 1) {
                        // Asignnamos asiento en la Primera Clase
                        asiento = asignarAsiento(asientos, 1, 5);
                        if (asiento != -1) {
                            System.out.println("Tu asiento de Primera Clase es el número: " + asiento);
                            mostrarTarjeta(asiento, "Primera Clase");
                        } else {
                            System.out.println("Lo siento, todos los asientos están ocupados.");
                            System.out.println("El próximo vuelo sale en 3 horas.");
                        }
                    }
                }
            } else {
                System.out.println("Opción no válida. Por favor seleccione 1 o 2.");
            }
        } while (opcion != 1 && opcion != 2);

    }

    public static int asignarAsiento(boolean[] asientos, int inicio, int fin) {

        //Método para elegir asientos
        //Si al elegir asientos este se repite, se vuelve a buscar uno vacio
        int asiento = (int) (Math.random() * (fin - inicio + 1)) + inicio;
        while (asientos[asiento - 1] == true) {
            asiento = (int) (Math.random() * (fin - inicio + 1)) + inicio;
        }
        //Si hay asientos devuelve el asiento si no devolverá -1
        if (asientos[asiento - 1] == false) {
            asientos[asiento - 1] = true;
            return asiento;
        } else {
            return -1;
        }
    }

    public static void mostrarTarjeta(int asiento, String seccion) {
        //Método para mostrar la tarjeta de embarque
        System.out.println("-----------------------------------");
        System.out.println("|           TARJETA DE EMBARQUE     |");
        System.out.println("-----------------------------------");
        System.out.println("| Asiento: " + asiento + "            |");
        System.out.println("| Sección: " + seccion + "            |");
        System.out.println("-----------------------------------");
    }

}
