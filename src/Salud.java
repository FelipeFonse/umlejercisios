public class Salud extends Empleado {
    private boolean tieneEps;
    private String  nombreEps;

    public Salud(String nombre, String cedula, int edad,
                 boolean tieneEps, String nombreEps) {
        super(nombre, cedula, edad); // llama al constructor del padre
        this.tieneEps  = tieneEps;
        this.nombreEps = nombreEps;
    }

    public boolean isTieneEps() {
        return tieneEps;
    }

    public void setTieneEps(boolean tieneEps) {
        this.tieneEps = tieneEps;
    }

    public String getNombreEps() {
        return nombreEps;
    }

    public void setNombreEps(String nombreEps) {
        this.nombreEps = nombreEps;
    }

    @Override
    public String toString() {
        return "Salud{" +
                "tieneEps=" + tieneEps +
                ", nombreEps='" + nombreEps + '\'' +
                '}';
    }
}
