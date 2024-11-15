package Mascotas;

public class Tortuga extends Mascota {
    private final int velocidad;


    public Tortuga(String nombre, int edad, int velocidad) {
        super(nombre, edad);
        this.velocidad = velocidad;
    }

    public void mostrarDatos() {
        mostrarMascota();
        System.out.println("Velocidad: " + velocidad);
    }
}

