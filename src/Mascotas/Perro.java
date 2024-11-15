package Mascotas;

public class Perro extends Mascota {
    private final String raza;


    public Perro(String nombre, int edad) {
        super(nombre, edad);
        this.raza = "Desconocida";
    }

    public void mostrarPerro() {
        mostrarMascota();
        System.out.println("Raza: " + raza);
    }
}

