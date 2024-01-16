// Clase Repartidor
public class Repartidor extends Empleado {
    private String zona;

    // Constructor de la clase Repartidor
    public Repartidor(String nombre, int edad, double salario, String zona) {
        // Llamada al constructor de la clase padre para inicializar los atributos heredados
        super(nombre, edad, salario);
        this.zona = zona;
    }

    // Métodos getter y setter para el atributo zona
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    // Implementación del método plus() de la clase padre
    @Override
    public void plus() {
        if (getEdad() < 25 && zona.equalsIgnoreCase("zona 3")) { // Verificar si se cumple la condición para aplicar el plus
            setSalario(getSalario() + 1000); // Aumentar el salario en 1000 euros
            System.out.println("Se aplicó el plus al empleado repartidor " + getNombre());
        }
    }

    // Sobrescritura del método toString() de la clase padre
    @Override
    public String toString() {
        return super.toString() + ", Zona: " + zona;
    }
}
