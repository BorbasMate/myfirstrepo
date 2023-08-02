import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        String input = sca.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i += 4) {

            char firstChar = input.charAt(i);
            output = output + firstChar;

            if (i + 1 < input.length()) {
                char secondChar = input.charAt(i + 1);
                output = output + secondChar;
            }

        }

        System.out.println(output);

    }

}
