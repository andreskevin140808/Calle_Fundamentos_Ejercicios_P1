// Autor: Kevin Andrés Calle Arteaga
import java.util.Scanner;

public class T1_P2_Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();

        System.out.println(numero % 2 == 0);

        sc.close();
    }
}