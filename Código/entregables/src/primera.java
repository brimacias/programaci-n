import java.util.Scanner;

public class primera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        String R;

        if(num >= 0) {
            R = "POSITIVO";
        } else {
            R = "NEGATIVO";
        }
        System.out.println("El número es " + R + ".");
    }
}