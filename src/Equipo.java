public class Equipo {
    private String   nombre;
    private Jugador  jugador1;  // ◇ agregación
    private Jugador  jugador2;  // ◇ agregación
    private Jugador  jugador3;  // ◇ agregación

    // Los jugadores se crean FUERA y se pasan al equipo
    // Si el equipo desaparece, los jugadores siguen existiendo
    public Equipo(String nombre, Jugador jugador1,
                  Jugador jugador2, Jugador jugador3) {
        this.nombre   = nombre;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
    }

    public void mostrarEquipo() {
        System.out.println("====== Equipo: " + nombre + " ======");
        System.out.println(jugador1.getInfo());
        System.out.println(jugador2.getInfo());
        System.out.println(jugador3.getInfo());
        System.out.println("================================");
    }
}
