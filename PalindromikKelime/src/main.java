import java.util.Scanner;

public class main {

    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kelimeyi girin: ");
        String word = scanner.nextLine();

        if (isPalindrome(word.toLowerCase())) {
            System.out.println("Bu kelime bir palindromiktir!");
        } else {
            System.out.println("Bu kelime bir palindromik değildir.");
        }
    }
}
