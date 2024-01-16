//Hecho por Pedro González
public class TestPersona {
    //Creamos los objetos persona1 y persona2 y probamos que funcione
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("54143720H", 176, 15);

        System.out.println("Persona 1 : NIF: " + persona1.getNIF() + ", Altura: " + persona1.getAltura() + " cm, Edad: " + persona1.getEdad() + " años");
        System.out.println("Persona 2 : NIF: " + persona2.getNIF() + ", Altura: " + persona2.getAltura() + " cm, Edad: " + persona2.getEdad() + " años");
    }
}
