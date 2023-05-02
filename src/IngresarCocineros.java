import java.util.Scanner;

public class IngresarCocineros {
    Cocinero[] cocineros=new Cocinero[6];
    public void ingresar(){
        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<cocineros.length; i++){
            System.out.println("Datos del cocinero"+(i+1));
            System.out.println("Ingresa el nombre");
            String nombre=scanner.nextLine();
            scanner.nextLine();
            System.out.println("Ingresa el tiempo que se tarda en cocinar para 400 personas");
            double tiempoDeCocina=scanner.nextDouble();
            cocineros[i]=new Cocinero(nombre,tiempoDeCocina);
            double tiempo=cocineros[i].getTiempoDeCocina();
        }
    }
    public void mostrarEspecialidad(){
        System.out.println("La especialidad es:");
        System.out.println(Cocinero.getEspecialidad());
        System.out.println("Tiempo en que tarda el equipo es de:");
        System.out.println(Cocinero.getTiempoDeCocinaPorEquipo());
    }


}

