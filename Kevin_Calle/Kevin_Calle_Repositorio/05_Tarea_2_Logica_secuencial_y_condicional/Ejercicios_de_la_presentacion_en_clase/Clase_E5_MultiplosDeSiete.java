// Autor: Kevin Calle
// Ejercicio en clase 5: múltiplos de 7 entre 1 y 100.
public class Clase_E5_MultiplosDeSiete {
    public static void main(String[] args) {
        int contador = 0;
        System.out.println("Múltiplos de 7 entre 1 y 100:");

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 7 == 0) {
                System.out.print(numero + " ");
                contador++;
            }
        }

        System.out.println();
        System.out.println("Cantidad de múltiplos: " + contador);
    }
}
