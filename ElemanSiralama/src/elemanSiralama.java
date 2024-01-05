import java.util.Arrays;
import java.util.Scanner;

public class elemanSiralama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Kullanıcıdan elemanları alma
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı girin: ");
            arr[i] = scanner.nextInt();
        }

        // Diziyi sıralama
        Arrays.sort(arr);

        // Sıralanmış diziyi ekrana yazdırma
        System.out.print("Sıralama: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
