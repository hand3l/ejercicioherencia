package Mascotas;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 5);
        Gato gato = new Gato("Luna", 3, "Blanco");
        Tortuga tortuga = new Tortuga("Flash", 80, 2);
        Loro loro = new Loro();
        loro.setNombre("Paco");
        loro.setEdad(2);
        loro.setRegionOrigen("Amazonas");
        Hamster hamster = new Hamster("Hammy", 1, "Pequeño");

        System.out.println("Información de las Mascotas:");
        System.out.println("\nInformacion Perro:");
        perro.mostrarPerro();
        System.out.println();
        System.out.println("\nInformacion Gato:");
        gato.mostrarGato();
        System.out.println();
        System.out.println("\nInformacion Tortuga:");
        tortuga.mostrarDatos();
        System.out.println();
        System.out.println("\nInformacion Loro:");
        loro.mostrarDatos();
        System.out.println();
        System.out.println("\nInformacion Hamster:");
        hamster.mostrarDatos();
    }
}
