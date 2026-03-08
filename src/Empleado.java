public class Empleado {
    String nom; // como son  variables compartidas no se private
    Empresa empresa;

    public Empleado(String nom, Empresa empresa) {
        this.nom = nom;
        this.empresa = empresa;
    }
public  String precentarce() {
    return "soy " + this.nom + " y trabajo en " + this.empresa.nom;// gurda en las dos clases
   }

}
