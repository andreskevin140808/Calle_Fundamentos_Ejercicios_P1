// Autor: Kevin Andrés Calle Arteaga
import java.util.Scanner;

public class T1_P4_Minutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int resto = minutos % 60;

        System.out.println(horas + " horas y " + resto + " minutos");

        sc.close();
    }
}