import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println(" ingrese su nombre");
         String nombre=teclado.nextLine();
        System.out.println(" ingrese su  Empresa");
        String emPresa= teclado.nextLine();
        Empresa empresa = new Empresa(emPresa);
        Empleado empleado = new Empleado(nombre, empresa);

        System.out.println( empleado.precentarce());

        teclado.close();
    }
}

