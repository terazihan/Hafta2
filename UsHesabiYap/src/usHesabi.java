/** @author Erhan YILDIRIM (Patika.dev) - 04.01.2024 */
import java.util.Scanner;

public class usHesabi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz: ");
            int base = scanner.nextInt();

            System.out.print("Üs değerini giriniz: ");
            int exponent = scanner.nextInt();

            int result = calculatePower(base, exponent);
            System.out.println("Sonuç: " + result);
        }
    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
}
