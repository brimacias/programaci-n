import java.util.Scanner;

public class viaje_estudios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float cadaAlum,rentaBus = 0;
        System.out.println("Introducir el número de alumnos: ");
        int numAlum = teclado.nextInt();
        if (numAlum<=100) {
            rentaBus = 65;
        } else {
            if (numAlum>=50 && numAlum<=99) {
                rentaBus = 70;
            } else {
                if (numAlum < 30) {
                    rentaBus = 4000;
                }
            }
        }
        float pago = rentaBus*numAlum;
        cadaAlum = pago/numAlum;
        System.out.println("El pago total a hacer es de " + pago + " euros.");
        System.out.println("El coste a pagar por alumno es de " + cadaAlum + " euros.");
    }
}
