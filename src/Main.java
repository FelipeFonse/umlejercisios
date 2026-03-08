import java.util.*;
public  class Main {
    public static void main(String[] args) {

        // Las partes (CPU, RAM, Disco) se crean DENTRO del Computador
        // No existen por fuera de él  →  eso es COMPOSICIÓN
        Pc pc1 = new Pc("Dell",    "Intel i7", 3.8, 16, 512, "SSD");
        Pc pc2 = new Pc("HP",      "AMD Ryzen", 3.2, 8, 1000, "HDD");
        Pc pc3 = new Pc("Lenovo",  "Intel i5", 2.9, 32, 256, "SSD");

        pc1.mostrarEspecificaciones();
        System.out.println();
        pc2.mostrarEspecificaciones();
        System.out.println();
        pc3.mostrarEspecificaciones();
    }
}
