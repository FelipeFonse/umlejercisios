import java.util.*;
public class Main {
    public static void main(String[] args) {

        // Jugadores se crean FUERA del equipo  → eso es AGREGACIÓN
        Jugador j1 = new Jugador("Carlos",  10);
        Jugador j2 = new Jugador("Andrés",  7);
        Jugador j3 = new Jugador("Miguel",  1);

        // Se pasan al equipo desde afuera
        Equipo equipo = new Equipo("Los Tigres", j1, j2, j3);
        equipo.mostrarEquipo();

        System.out.println();

        // Los jugadores siguen existiendo sin el equipo
        System.out.println("Jugadores sin equipo:");
        System.out.println(j1.getInfo());
        System.out.println(j2.getInfo());
        System.out.println(j3.getInfo());

