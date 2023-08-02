import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        int a = sca.nextInt();
        int b = sca.nextInt();
        int c = sca.nextInt();

        int result;

        if (a == 2 && b == 2 && c == 2) {
            result = 10;
        } else if (a == b && b == c) {
            result = 5;
        } else if (b != a && c != a) {
            result = 1;
        } else {
            result = 0;
        }

        System.out.println(result);


    }
}
