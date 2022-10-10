import java.util.Scanner;

public class septima {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double val,precio,descuento;
        double descuento5,descuento10;
        System.out.println("Escribir valor bruto: ");
        val = teclado.nextDouble();
        descuento5 = val * 0.05;
        descuento10 = val * 0.1;

        if(val <= 20000) {
            precio = val;
            System.out.println("El valor inicial era de " + val);
            System.out.println("El precio es de " + precio);
        } else if (val > 20000 && val <= 100000) {
            precio = val - descuento5;
            System.out.println("El valor inicial era de " + val);
            System.out.println("El precio es de " + precio);
        } else if (val > 100000) {
            precio = val - descuento10;
            System.out.println("El valor inicial era de " + val);
            System.out.println("El precio es de " + precio);
        }
    }
}
