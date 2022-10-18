public class mostrar1al100x2o3 {
    public static void main(String[] args) {
        int num = 0;
        while (num % 2 == 0 && num % 3 == 0) {
            for (int i = 0; i <= 99; i++) {
                num++;
                System.out.println(num);
            }
        }
    }
}
