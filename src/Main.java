import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        int pozitive = 0;
        int negative = 0;
        for (int num = 0; num < numar; num++) {
            int elemente = scanner.nextInt();
            if (elemente < 0) {
                negative++;
            } else if (elemente >= 0) {
                pozitive++;
            }
        }
        System.out.println("Numere pozitive: " + pozitive);
        System.out.println("Numere negative: " + negative);
    }
}