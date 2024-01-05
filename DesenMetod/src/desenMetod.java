import java.util.Scanner;

public class desenMetod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        manipulateNumber(number);

        scanner.close();
    }

    public static void manipulateNumber(int number) {
        System.out.print(number + " ");

        if (number <= 0) {
            System.out.println();
            return;
        }

        manipulateNumber(number - 5);

        if (number > 0) {
            System.out.print(number + " ");
        }
    }
}
