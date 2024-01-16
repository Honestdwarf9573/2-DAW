public class Herencias {
    public static void main(String[] args) {
        // Crear empleados
        Comercial comercial1 = new Comercial("Juan", 35, 1500, 250);
        Comercial comercial2 = new Comercial("María", 40, 1800, 300);
        Repartidor repartidor1 = new Repartidor("Pedro", 22, 1200, "zona 1");
        Repartidor repartidor2 = new Repartidor("Laura", 28, 1300, "zona 3");

        // Aplicar plus a los empleados
        comercial1.plus();
        comercial2.plus();
        repartidor1.plus();
        repartidor2.plus();

        // Mostrar información de los empleados
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(repartidor1);
        System.out.println(repartidor2);
    }
}
