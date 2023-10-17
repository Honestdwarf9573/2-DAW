
//Hecho por Pedro González
import java.util.Scanner;

public class Rectangulo {
    // Creamos las variables
    protected double longitud;
    protected double anchura;

    // Creamos el constructor
    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }
//Y el constructor vacio
    public Rectangulo(){
        this.longitud=1;
        this.anchura=1;
    }

    // Creamos el método para calcular el perímetro
    public void calcularPerimetro() {
        this.longitud = this.longitud * 4;
    }

    // Creamos el método para calcular el área
    public void calcularArea() {
        this.longitud = this.longitud * this.anchura;
    }

    // Creamos el método establecer de la longitud
    // Si no cumple la condicion devuelve false y si la cumple true
    public boolean establecerLongitud() {
        if (this.longitud < 0 || this.longitud > 20) {
            return false;
        } else {
            return true;
        }
    }

    // Método para obtener longitud
    public void obtenerLongitud(double longitud) {
        this.longitud = longitud;
    }

    // Creamos el método establecer de la anchura
    // Si no cumple la condicion devuelve false y si la cumple true
    public boolean establecerAnchura() {
        if (this.anchura < 0 || this.anchura > 20) {
            return false;
        } else {
            return true;
        }
    }

    // Método para obtener anchura
    public void obtenerAnchura(double anchura) {
        this.anchura = anchura;
    }
}
