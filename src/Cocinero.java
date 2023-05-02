public class Cocinero {
    private int id_cocinero;
    private String nombre;
    private double tiempoDeCocina;
    static int contador=1;
    static String especialidad="Comida Internacional";
    static double tiempoDeCocinaPorEquipo=0;

    public Cocinero( String nombre, double tiempoDeCocina){
        this.id_cocinero=contador;
        this.nombre=nombre;
        this.tiempoDeCocina=tiempoDeCocina;
        contador++;
        sumar(tiempoDeCocina);
    }

    public double getTiempoDeCocina() {
        return tiempoDeCocina;
    }

    public static String getEspecialidad() {
        return especialidad;
    }

    public static double getTiempoDeCocinaPorEquipo() {
        return tiempoDeCocinaPorEquipo;
    }

    private void sumar(double tiempo){
        tiempoDeCocinaPorEquipo=tiempoDeCocinaPorEquipo+tiempo;
    }
}
