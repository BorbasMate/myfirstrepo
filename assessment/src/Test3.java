import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        String inputString = sca.nextLine();

        int lenghtOFSting = inputString.length();

        int count = 0;

//        for (int i = 0; i < lenghtOFSting - 1; i++) {
//
//            if (i >= lenghtOFSting - 2 && inputString.substring(i,i+2).equals("xx")) {
//                count++;
//            } else if (inputString.substring(i,i+2).equals("xx")) {
//                count++;
//            }
//        }

        for (int i = 0; i < lenghtOFSting - 1; i++) {

            if (inputString.substring(i,i+2).equals("xx")) {
                count++;
            }
        }

        System.out.println(count);

    }
}
