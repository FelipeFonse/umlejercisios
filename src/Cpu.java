public class Cpu {
    private String marca;
    private double velocidad; // GHz

    public Cpu(String marca, double velocidad) {
        this.marca     = marca;
        this.velocidad = velocidad;
    }

    public String getInfo() {
        return "CPU: " + marca + " - " + velocidad + " GHz";
    }
}


