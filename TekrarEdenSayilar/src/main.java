import java.util.*;

public class main {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6, 8, 4, 5, 10, 6, 8, 12, 10, 14};

        System.out.println("Tekrar eden çift sayılar:");
        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue() + " kez tekrar ediyor.");
            }
        }
    }
}
