package Mascotas;

public class Hamster extends Mascota {
    private final String tamanio;


    public Hamster(String nombre, int edad, String tamanio) {
        super(nombre, edad);
        this.tamanio = tamanio;
    }

    public void mostrarDatos() {
        mostrarMascota();
        System.out.println("Tamaño: " + tamanio);
    }
}
