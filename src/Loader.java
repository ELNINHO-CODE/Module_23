
import java.util.Scanner;

class Loader {
    public static void main(String[] args) {
        int i,j;
        String[] result = new String[5];
        int[][] points = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9},
        };
        int[] sumPoints = new int[5];
        String[] names = {"Alex","Igor","Michael","Nicolay","Vladimir"};
        for (i=0; i < names.length; i++) {
            for (j = 0; j < points[i].length; j++) {
                sumPoints [i] += points[i][j];
            }
            result[i] = names[i] + " " + sumPoints [i];
            System.out.println(result[i]);
            System.out.println(result[i]+1);
        }
    }
}