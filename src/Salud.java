public class Salud extends Empleado implements  Asegura {
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
    public void verificarEps () {
        if (tieneEps) {
        System.out.println(   getNombre() + " Si tiene EPS");
        System.out.println("EPS : " + nombreEps);
    } else {
        System.out.println("No tiene eps");
    }


    }

    @Override
    public void mostrarCompaniaEps() {
        if (tieneEps) {
            System.out.println("Compañía EPS: " + nombreEps);
        } else {
            System.out.println("No aplica, no tiene EPS.");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("    SALUD   ");
        verificarEps();
        mostrarCompaniaEps();
    }
}
