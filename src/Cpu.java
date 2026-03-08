public class Cpu {
    private String marcaCpu;
    private double velocidad; // GHz

    public Cpu(String marca, double velocidad) {
        this.marcaCpu     = marca;
        this.velocidad = velocidad;
    }

    public String Info() {
        return "CPU: " + marcaCpu + " - " + velocidad + " GHz";
    }
}


