import java.util.Arrays;

public class diziMaxMin {

    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        int number = 5;

        int smallerClosest = findSmallerClosest(array, number);
        int largerClosest = findLargerClosest(array, number);

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallerClosest);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + largerClosest);
    }

    public static int findSmallerClosest(int[] array, int number) {
        int closest = Integer.MIN_VALUE;

        for (int value : array) {
            if (value < number && value > closest) {
                closest = value;
            }
        }

        return closest;
    }

    public static int findLargerClosest(int[] array, int number) {
        int closest = Integer.MAX_VALUE;

        for (int value : array) {
            if (value > number && value < closest) {
                closest = value;
            }
        }

        return closest;
    }
}
