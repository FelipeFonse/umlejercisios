public class Impresora {
    private String modelo;

    public Impresora(String modelo) {
        this.modelo = modelo;
    }

    public void imprimir(String documento) {
        System.out.println("Impresora " + modelo + " imprimiendo: " + documento);
    }
}
