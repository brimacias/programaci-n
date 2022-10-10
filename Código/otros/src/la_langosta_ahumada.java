import java.util.Scanner;

public class la_langosta_ahumada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int costo;
        System.out.println("Introducir número de personas: ");
        int numPersonas = teclado.nextInt();
        if (numPersonas <= 200) {
            costo = 95;
        } else {
            if (numPersonas>200 && numPersonas<=300) {
                costo = 85;
            } else {
                costo = 75;
            }
        }
        int presupuesto = numPersonas*costo;
        System.out.println("El presupuesto es de "+ presupuesto + " euros.");
    }
}
