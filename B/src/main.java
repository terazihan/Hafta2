public class main {

    public static void main(String[] args) {
        int row, column;
        int size = 7; // "B" harfinin boyutunu ayarlamak için kullanılır

        for (row = 0; row < size; row++) {
            for (column = 0; column < size; column++) {
                if ((row == 0 || row == size / 2 || row == size - 1) ||
                        (column == 0 || column == size - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
