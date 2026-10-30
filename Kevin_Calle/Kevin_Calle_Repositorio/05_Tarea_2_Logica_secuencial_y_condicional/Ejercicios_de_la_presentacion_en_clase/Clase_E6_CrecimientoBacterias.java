// Autor: Kevin Calle
// Ejercicio en clase 6: población que se duplica cada hora.
public class Clase_E6_CrecimientoBacterias {
    public static void main(String[] args) {
        long poblacion = 100;
        int horas = 0;
        final long LIMITE = 1_000_000;

        while (poblacion <= LIMITE) {
            poblacion *= 2;
            horas++;
        }

        System.out.println("Horas necesarias: " + horas);
        System.out.println("Población final: " + poblacion);
    }
}
