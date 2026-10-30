import java.util.Scanner;

public class T2_P4_HoraSiguiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas (0-23): ");
        int horas = sc.nextInt();

        System.out.print("Minutos (0-59): ");
        int minutos = sc.nextInt();

        System.out.print("Segundos (0-59): ");
        int segundos = sc.nextInt();

        if (horas < 0 || horas > 23 ||
            minutos < 0 || minutos > 59 ||
            segundos < 0 || segundos > 59) {

            System.out.println("Hora invalida");
        } else {
            int total = (horas * 3600 + minutos * 60
                         + segundos + 1) % 86400;

            int h = total / 3600;
            int m = (total % 3600) / 60;
            int s = total % 60;

            System.out.printf(
                "Hora siguiente: %02d:%02d:%02d%n", h, m, s
            );
        }

        sc.close();
    }
}