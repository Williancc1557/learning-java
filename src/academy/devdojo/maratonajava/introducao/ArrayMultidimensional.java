package academy.devdojo.maratonajava.introducao;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] data = new int[3][3];

        data[0][0] = 1;
        data[0][1] = 2;
        data[0][2] = 3;

        data[1][0] = 1;
        data[1][1] = 2;
        data[1][2] = 3;

        data[2][0] = 1;
        data[2][1] = 2;
        data[2][2] = 3;

        for (int[] date : data) {
            for (int hour : date) {
                System.out.println(hour);
            }
        }
    }
}
