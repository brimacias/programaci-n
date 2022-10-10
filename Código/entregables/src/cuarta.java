import java.util.Scanner;

public class cuarta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Introducir tres números enteros: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();

        if(n1 == n2 + n3) {
            System.out.println("Números introducidos: " + n1 + " ," + n2 + " ," + n3);
            System.out.println("Se cumple que n1 = n2 + n3");
        } else if (n2 == n1 + n3) {
            System.out.println("Números introducidos: " + n1 + " ," + n2 + " ," + n3);
            System.out.println("Se cumple que n2 = n1 + n3");
        } else if (n3 == n1 + n2) {
            System.out.println("Números introducidos: " + n1 + " ," + n2 + " ," + n3);
            System.out.println("Se cumple que n3 = n1 + n2");
        } else if(n1 != n2 + n3 && n2 != n1 + n3 && n3 != n1 + n2) {
            System.out.println("Los números no cumplen la condición.");
        }
    }
}
