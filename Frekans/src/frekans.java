import java.util.HashMap;

public class frekans {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " sayısı " + frequencyMap.get(key) + " kere tekrar edildi.");
        }
    }
}
