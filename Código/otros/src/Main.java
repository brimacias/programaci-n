import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x,contador;
        System.out.println("Escribe el número: ");
        int num = teclado.nextInt();
        contador = 0;
        x = 1;
        do {
            if (num % x == 0) {
                contador++;
            } else {
                contador = contador;
            }
            x++;
        } while (x<=num);
        if (contador == 2) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }
    }
}