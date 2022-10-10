import java.util.Scanner;

public class tercera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,suma;
        System.out.println("Escribir dos números: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        if(n1 > 0 && n2 >= 0) {
            suma = n1 + n2;
            System.out.println("Números introducidos: " + n1 + " ," + n2);
            System.out.println("La suma de los dos números es: " + suma);
        } else {
            if (n1 < 0 && n2 < 0) {
                System.out.println("No se calcula la suma porque los dos números son negativos.");
            } else if (n1 < 0) {
                System.out.println("No se calcula la suma porque el primer número es negativo.");
            } else if (n2 < 0) {
                System.out.println("No se calcula la suma porque el segundo número es negativo.");
            }
        }
    }
}
