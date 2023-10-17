public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private double peso;

    public Perro(String nombre, int edad, String raza, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
    }

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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(String tipoComida, double cantidadGramos) {
        System.out.println(nombre + " está comiendo " + tipoComida + " en una cantidad de " + cantidadGramos + " gramos.");
        // Realizar aquí las acciones necesarias relacionadas con la comida del perro.
    }

    public String ladrar() {
        return "guau guau";
    }
}