/** @author Erhan YILDIRIM (Patika.dev) - 04.01.2024 */
import java.util.Scanner;

public class palindrom { //Kullanıcının girdiği sayıyı bir değişkene atıyoruz.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPalindrom(number)) { //Aşağıdaki "isPalindrom" metoduna göre sonuç veren kısmı yazıyoruz.
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }

    public static boolean isPalindrom(int number) { //İlk sayıyı kaybetmemek için (karşılaştırma yapmak için) originla Number değişkenine atıyoruz.
        int originalNumber = number;
        int reverse = 0;

        while (number > 0) { //Sayının tersini bulmak için sayı 10'a bölünürve her defasında son rakam reverse değişkenine aktarılır.
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
