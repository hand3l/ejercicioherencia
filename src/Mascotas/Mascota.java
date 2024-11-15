package Mascotas;

public class Mascota {
    private String nombre;
    private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarMascota() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

