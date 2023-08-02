import java.util.Arrays;
import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        int[][] array2D = new int [6][6];
        int maxHourGlass = Integer.MIN_VALUE;
        int sum;

        int a, b, c, d, e, f, g;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                array2D[i][j] = sca.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                a = array2D[i][j];
                b = array2D[i][j+1];
                c = array2D[i][j+2];
                d = array2D[i+1][j+1];
                e = array2D[i+2][j];
                f = array2D[i+2][j+1];
                g = array2D[i+2][j+2];

                sum = a + b + c + d + e + f + g;

                if (sum > maxHourGlass) {
                    maxHourGlass = sum;
                }

            }
        }

        System.out.println(maxHourGlass);

    }
}
