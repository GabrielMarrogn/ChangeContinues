import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double segundos = 0;
            double tempoAtual = 0;

            double a = sc.nextDouble();

            // 360 é quando o ciclo e fechado e então recomeça então seria equivalente a 6
            // horas assim com o 0
            if (a == 360) {
                a = 0;
            }
            if (a >= 0 && a < 90) {
                segundos = a * 240;
                int hora = 21600;
                tempoAtual = segundos + hora;
                System.out.println("Bom Dia!!");
            } else if (a >= 90 && a < 180) {
                a = a - 90;
                segundos = a * 240;
                int hora = 43200;
                tempoAtual = segundos + hora;
                System.out.println("Boa Tarde!!");
            } else if (a >= 180 && a < 270) {
                a = a - 180;
                segundos = a * 240;
                int hora = 64800;
                tempoAtual = segundos + hora;
                System.out.println("Boa Noite!!");
            } else if (a >= 270 && a < 360) {
                a = a - 270;
                segundos = a * 240;
                int hora = 0;
                tempoAtual = segundos + hora;
                System.out.println("De Madrugada!!");
            }

            SegundoHora(tempoAtual);
        }
        sc.close();
    }

    public static void SegundoHora(double total) {
        double horas = Math.floor(total / 3600);
        double minutos = Math.floor((total - (horas * 3600)) / 60);
        Double segundo = Math.floor(total % 60);
        DecimalFormat decimal = new DecimalFormat("00");

        System.out.println(decimal.format(horas) + ":" + decimal.format(minutos) + ":" + decimal.format(segundo));
    }
}
