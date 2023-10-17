//Hecho por Pedro González
import java.util.Scanner;

public class Arrays_Ejercicios_Pedro{

    public static void main(String[]args){

        menu();

    }

    public static void menu(){
        //Declaramos variables
       Scanner teclado=new Scanner(System.in);
        String cadena="";
       byte opcion;
       String salida="";
       boolean salir=false;
       //Ofrecemos opciones
       do {
            System.out.println("Bienvenido al menú:\nOpción 1 :Ejercicio 1\nOpción 2: Ejercicio 2\nOpción 3: Salir");
       opcion=teclado.nextByte();
       switch(opcion){
        //Primer caso: El ejercicio 1
               case 1:
                aerolinea();
        //Segundo caso: El ejercicio 2
               break;
               case 2:
                  ventas();
        //Tercer caso: Salir
               break;
               case 3:
             
               do {
                   
                   System.out.println("Si desea salir escriba salir,en caso contrario volverá al menú");
                   teclado.nextLine();
                   salida=teclado.nextLine();
                   if(salida.equals("salir")){
                       System.out.println("Tenga un buen día");
                       salir=true;
                      break;
                      
                   }else{
                       break;
                   }
               } while (salida!="salir");
               break;
               default:
               System.out.println("Opción no válida");
               break;

       }
       } while (salir!=true);
      
       

   }


   public static  void aerolinea(){
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
        System.out.println("***********************************");
        System.out.println("*           TARJETA DE EMBARQUE     *");
        System.out.println("***********************************");
        System.out.println("* Asiento: " + asiento + "                        *");
        System.out.println("* Sección: " + seccion + "            *");
        System.out.println("***********************************");
    }



    public static void ventas() {
        double[][] ventas = new double[4][5];
        Scanner input = new Scanner(System.in);
    
        // Solicitar información para cada uno de los cinco productos
        //Aunque va a preguntar 30 veces, una por cada dia del mes
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el número del vendedor (1-4): ");
                int vendedor = input.nextInt();
                System.out.print("Ingrese el número del producto (1-5): ");
                int producto = input.nextInt();
                System.out.print("Ingrese el valor total en euros de ese producto vendido en ese día: ");
                double valor = input.nextDouble();
                ventas[vendedor - 1][producto - 1] += valor;
            }
        }
    
        // Imprimir los resultados
        System.out.printf("%10s%10s%10s%10s%10s%10s%10s\n", "", "Vendedor 1", "Vendedor 2", "Vendedor 3", "Vendedor 4", "Total", "Promedio");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%10s", "Producto " + (i+1));
            double total = 0;
            for (int j = 0; j < 4; j++) {
                System.out.printf("%10.2f ", ventas[j][i]);
                total += ventas[j][i];
            }
            System.out.printf("%10.2f%10.2f\n", total, total/4);
        }
    }
    


}
