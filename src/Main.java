import java.util.*;
public class Main {
    public static void main(String[] args) {

        // Se crea la impresora por fuera
        Impresora impresora = new Impresora("HP LaserJet");

        // Empleados que la usan temporalmente
        Empleado emp1 = new Empleado("Carlos");
        Empleado emp2 = new Empleado("Laura");
        Empleado emp3 = new Empleado("Andrés");

        // Cada empleado usa la impresora solo en ese momento
        // Cuando termina el  metodo desaparece
        emp1.imprimirInforme(impresora);
        emp2.imprimirInforme(impresora);
        emp3.imprimirInforme(impresora);
    }
}