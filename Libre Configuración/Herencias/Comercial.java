// Clase Comercial
public class Comercial extends Empleado {
    private double comision;

    // Constructor de la clase Comercial
    public Comercial(String nombre, int edad, double salario, double comision) {
        // Llamada al constructor de la clase padre para inicializar los atributos heredados
        super(nombre, edad, salario);
        this.comision = comision;
    }

    // Métodos getter y setter para el atributo comision
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    // Implementación del método plus() de la clase padre
    @Override
    public void plus() {
        if (getEdad() > 30 && comision > 200) { // Verificar si se cumple la condición para aplicar el plus
            setSalario(getSalario() + 300); // Aumentar el salario en 300 euros
            System.out.println("Se aplicó el plus al empleado comercial " + getNombre());
        }
    }

    // Sobrescritura del método toString() de la clase padre
    @Override
    public String toString() {
        return super.toString() + ", Comisión: " + comision;
    }
}
