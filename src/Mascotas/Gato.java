package Mascotas;

public class Gato extends Mascota {
    private final String color;


    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public void mostrarGato() {
        mostrarMascota();
        System.out.println("Color: " + color);
    }
}

