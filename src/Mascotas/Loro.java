package Mascotas;

public class Loro extends Mascota {
    private String regionOrigen;

    public Loro() {
        super();
        this.regionOrigen = "Desconocida";
    }

    public void setRegionOrigen(String regionOrigen) {
        this.regionOrigen = regionOrigen;
    }

    public void mostrarDatos() {
        mostrarMascota();
        System.out.println("Región de Origen: " + regionOrigen);
    }
}
