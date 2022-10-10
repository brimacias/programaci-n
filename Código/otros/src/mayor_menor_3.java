import java.util.Scanner;

public class mayor_menor_3 {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir 3 números: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int n3 = teclado.nextInt();
        if (n1>n2 && n1>n3) {
            System.out.println(n1 + " es el mayor.");
            if (n2>n3) {
                System.out.println(n3 + " es el menor.");
            } else {
                System.out.println(n2 + " es el menor.");
            }
        } else if (n2>n1 && n2>n3) {
            System.out.println(n2 + " es el mayor.");
            if (n1>n3) {
                System.out.println(n3 + " es el menor.");
            } else {
                System.out.println(n1 + " es el menor.");
            }
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Hay número iguales.");
        } else {
            if (n1>n2) {
                System.out.println(n2 + " es el menor.");
            } else {
                System.out.println(n1 + " es el menor.");
            }
        }
    }
}
