import java.util.Scanner;

public class ventas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numVentas = 0;
        System.out.println("Introducir número de ventas: ");

        for (int intro = teclado.nextInt(); intro >= numVentas; intro++) {
            System.out.println("Introducir número de ventas: ");
            numVentas = teclado.nextInt();
        }
    }
}
