//Hecho por Pedro Gonzalez
//Creamos la clase Articulo
class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
//Creamos los setters y los getters necesarios
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

//Creamos la clase tipo4
class Tipo4 extends Articulo {
    //Una variable estatica llamada tipo
    public static final double TIPO = 4.0;

    public Tipo4(String nombre, double precio) {
        super(nombre, precio);
    }
//Los getters
    public double getParteIVA() {
        return getPrecio() * TIPO / 100;
    }
//Este get hereda de la clase articulo
    @Override
    public double getPrecio() {
        return super.getPrecio() + getParteIVA();
    }
}

// Creamos la clase Tipo 7
class Tipo7 extends Articulo {
    public static final double TIPO = 7.0;
//La variable tipo y sus constructores
    public Tipo7(String nombre, double precio) {
        super(nombre, precio);
    }

    public double getParteIVA() {
        return getPrecio() * TIPO / 100;
    }
//El get heredado más lo que tenemos que añadir
    @Override
    public double getPrecio() {
        return super.getPrecio() + getParteIVA();
    }
}

//La clase Tipo 16
class Tipo16 extends Articulo {
    //Creamos la variable tipo, el contructor, el get y el get heredado
    public static final double TIPO = 16.0;

    public Tipo16(String nombre, double precio) {
        super(nombre, precio);
    }

    public double getParteIVA() {
        return getPrecio() * TIPO / 100;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + getParteIVA();
    }
}
