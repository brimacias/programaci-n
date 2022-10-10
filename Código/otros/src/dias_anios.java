import java.util.Scanner;

public class dias_anios {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        int anios = 0;
        int meses = 0;
        int semanas = 0;
        int dias;
        System.out.println("Número de días: ");
        int numDias = teclado.nextInt();
        dias = numDias;

        //Años
        while (dias>365) {
            anios++;
            dias = dias - 365;
        }
        //Meses
        while (dias>=30) {
            meses++;
            dias = dias - 30;
        }
        //Semanas
        while (dias>=7) {
            semanas++;
            dias = dias - 7;
        }

        System.out.println("En " + numDias + " días hay " + anios + " año(s)," + meses + " mes(es), " + semanas
                + " semana(s) y " + dias + " día(s).");
    }
}
