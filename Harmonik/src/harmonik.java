public class harmonik {

    public static double calculateHarmonicMean(int[] numbers) {
        int n = numbers.length;
        double harmonicSum = 0.0;

        for (int i = 0; i < n; i++) {
            harmonicSum += 1.0 / numbers[i];
        }

        return n / harmonicSum;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8}; // Dizi örneği, istediğiniz gibi değiştirebilirsiniz

        double harmonicMean = calculateHarmonicMean(array);
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);
    }
}
