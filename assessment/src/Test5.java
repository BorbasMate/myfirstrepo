import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        String input = sca.nextLine();
        boolean flag = false;

        for (int i = 0; i < input.length() - 1; i++) {
            char first = input.charAt(i);
            char next = input.charAt(i+1);

            if (first == next) {
                flag = true;
                break;
            }
        }

        System.out.println(flag);
    }
}
