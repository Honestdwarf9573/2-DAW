public class Prueba_articulo {
    public static void main(String[] args) {
        // Crear un artículo de tipo Tipo4
        Tipo4 articuloTipo4 = new Tipo4("Artículo Tipo 4", 100.0);
        System.out.println("Nombre: " + articuloTipo4.getNombre());
        System.out.println("Precio sin IVA: " + articuloTipo4.getPrecio());
        System.out.println("Precio con IVA: " + articuloTipo4.getPrecio());

        // Crear un artículo de tipo Tipo7
        Tipo7 articuloTipo7 = new Tipo7("Artículo Tipo 7", 200.0);
        System.out.println("Nombre: " + articuloTipo7.getNombre());
        System.out.println("Precio sin IVA: " + articuloTipo7.getPrecio());
        System.out.println("Precio con IVA: " + articuloTipo7.getPrecio());

        // Crear un artículo de tipo Tipo16
        Tipo16 articuloTipo16 = new Tipo16("Artículo Tipo 16", 300.0);
        System.out.println("Nombre: " + articuloTipo16.getNombre());
        System.out.println("Precio sin IVA: " + articuloTipo16.getPrecio());
        System.out.println("Precio con IVA: " + articuloTipo16.getPrecio());
    }
}
