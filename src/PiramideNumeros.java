public class PiramideNumeros {
    public static void main(String[] args) {
        int number = 7;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
