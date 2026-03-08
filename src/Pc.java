// clase principal de donde se componen las clases Cpu Ram Procesador
public class Pc {
   private String marca;
    private Cpu    cpu;    // composición
    private Ram    ram;    // composición
    private Disco  disco;  // composición

    public Pc (String marca, String marcaCpu,double velocidad, int capacidadRam , int capacidadDisco, String tipoDisco) {
        this.marca = marca;
        this.ram = new Ram(capacidadRam);
        this.cpu = new Cpu(marcaCpu,velocidad);
        this.disco = new Disco(capacidadDisco, tipoDisco);

    }
    public void mostrarEspecificaciones() {
        System.out.println("====== Computador: " + marca + " ======");
        System.out.println(cpu.Info());
        System.out.println(ram.Info());
        System.out.println(disco.info());
    }
}
