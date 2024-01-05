import java.util.Scanner;

public class asalSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Sayı Giriniz: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " sayısı ASALDIR!");
            } else {
                System.out.println(number + " sayısı ASAL değildir!");
            }
        }
    }

    public static boolean isPrime(int number) {
        return isPrime(number, number / 2);
    }

    public static boolean isPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        } else {
            if (number % divisor == 0) {
                return false;
            } else {
                return isPrime(number, divisor - 1);
            }
        }
    }
}
