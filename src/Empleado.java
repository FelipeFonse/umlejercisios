public class Empleado {
    private String nombre;
    private String cedula;
    private int edad;

    public Empleado(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarInfo() {
        System.out.println("=== Empleado ===");
        System.out.println("Nombre : " + nombre);
        System.out.println("Cédula : " + cedula);
        System.out.println("Edad   : " + edad);
    }
}


