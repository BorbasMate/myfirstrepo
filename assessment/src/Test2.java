import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        int lenghtArray = sca.nextInt();
        int i = 0;
        int[] array = new int[lenghtArray];

        while (i < lenghtArray){
            array[i] = sca.nextInt();
            i++;
        }

        int sum = 0;

        for (int j = 0; j < lenghtArray; j++) {
            if (array[j] != 13) {
                sum += array[j];
            } else if (j != lenghtArray - 1 && array[j+1] == 13 ) {
                continue;
            } else {
                j++;
            }
        }

        if (i == 0) {
            System.out.println(0);
        } else {
            System.out.println(sum);
        }

    }

}
