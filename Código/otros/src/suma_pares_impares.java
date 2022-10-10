import java.util.Scanner;

public class suma_pares_impares {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        int n;
        int c_par = 0;
        int c_impar = 0;
        System.out.println("Introducir cantidad de números: ");
        n = teclado.nextInt();
        for (int i=0;n < 1;i++) {
            System.out.println("Número: " + i);
            int num = teclado.nextInt();
            if (num % 2 == 0) {
                c_par++;
                int sumaP = 0;
                sumaP = sumaP + num;
                System.out.println("Suma: " + sumaP);
            } else {
                c_impar++;
                int sumaI = 0;
                sumaI = sumaI + num;
                System.out.println("Suma: " + sumaI);
            }
        }
    }
}
