// Clase Empleado
public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    // Constructor de la clase Empleado
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos getter y setter para los atributos de la clase Empleado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void plus();

    // Método que devuelve una cadena con la información del empleado
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario;
    }
}
