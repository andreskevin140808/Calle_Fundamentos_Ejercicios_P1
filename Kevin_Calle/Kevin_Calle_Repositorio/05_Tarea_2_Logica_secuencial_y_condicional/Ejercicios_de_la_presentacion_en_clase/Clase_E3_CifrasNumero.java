import java.util.Scanner;

// Autor: Kevin Calle
// Ejercicio en clase 3: contar las cifras y sumar sus dígitos con while.
public class Clase_E3_CifrasNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        long auxiliar = Math.abs((long) numero);
        int cantidadCifras = 0;
        int sumaCifras = 0;

        if (auxiliar == 0) {
            cantidadCifras = 1;
        } else {
            while (auxiliar > 0) {
                sumaCifras += (int) (auxiliar % 10);
                cantidadCifras++;
                auxiliar /= 10;
            }
        }

        System.out.println("Cantidad de cifras: " + cantidadCifras);
        System.out.println("Suma de cifras: " + sumaCifras);
        sc.close();
    }
}
