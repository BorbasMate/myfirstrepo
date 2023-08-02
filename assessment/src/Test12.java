import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        String inputString = sca.nextLine();

        String[] inputStringArray = inputString.split(" ");
//        System.out.println(Arrays.toString(inputStringArray));

        List<String> resultList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            for (String s : inputStringArray) {
                if (s.contains(String.valueOf(i))) {
                    resultList.add(s);
                }
            }
        }

        if (inputString.isEmpty()) {
            System.out.println(" ");
        } else {
            for (String s : resultList) {
                System.out.print(s + " ");
            }
        }
    }
}
