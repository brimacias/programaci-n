import java.util.Scanner;

public class sexta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,suma;
        System.out.println("Introducir dos números: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        if(n1 % 2 == 0 && n2 % 2 == 0) {
            if(n1 < 50) {
                if(n2 >= 100 && n2 <= 500) {
                    suma = n1 + n2;
                    System.out.println("La suma de los números es " + suma + ".");
                }
            }
        } else {
            System.out.println("No se puede realizar la suma porque una o más condiciones no se cumplen");
        }
    }
}
