public class Disco {
    private String tipoDisco;   // SSD o HDD
    private int capacidadDisco; // GB


    public Disco(int capacidadDisco, String tipoDisco ) {
        this.capacidadDisco = capacidadDisco;
        this.tipoDisco      = tipoDisco;
    }

    public String info() {
        return "Disco: " + tipoDisco + " - " + capacidadDisco + " GB";
    }
}
