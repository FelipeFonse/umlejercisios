import java.util.*;

public class Main {
    public static void main(String[] args) {

        Salud emp1 = new Salud("Carlos Pérez", "1234567", 30, true, "Compensar");
        Salud emp2 = new Salud("Laura Gómez", "7654321", 25, true, "Salud Total");
        Salud emp3 = new Salud("Andrés Torres", "9876543", 40, true, "Cruz Blanca");
        Salud emp4 = new Salud("María Rodríguez", "1122334", 35, false, "");

        System.out.println();
        emp1.mostrarInfo();
        System.out.println();
        emp2.mostrarInfo();
        System.out.println();
        emp3.mostrarInfo();
        System.out.println();
        emp4.mostrarInfo();
    }
}
