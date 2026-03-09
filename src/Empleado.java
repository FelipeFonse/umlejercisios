public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Empleado NO guarda la impresora como atributo
    // Solo la usa dentro de este método  → eso es DEPENDENCIA
    public void imprimirInforme(Impresora impresora) {
        System.out.println("=== Empleado: " + nombre + " ===");
        impresora.imprimir("Informe de " + nombre);
    }
}
