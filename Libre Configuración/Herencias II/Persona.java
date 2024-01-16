//Hecho por Pedro González
public class Persona {
    //Creamos los atributos
    protected String NIF;
    protected int altura;
    protected int edad;
//Asignamos el constructor por defecto
    public Persona() {
        this.NIF = "11111111A";
        this.altura = 175;
        this.edad = 25;
    }
// Y asignamos el constructor que recibe valores
    public Persona(String NIF, int altura, int edad) {
        this.NIF = NIF;
        this.altura = altura;
        this.edad = edad;
    }
//Creamos los setters y los getters
    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//Y los métodos hablar y comer
  
        public void hablar() {
            System.out.println("¡Que buen día hace hoy!");
        }
    
        public void comer() {
           if(this.edad>10){
            System.out.println("Estoy comiendo");
           }else{
            System.out.println("¡No quiero comer!");
           }
        }
    
    
}
