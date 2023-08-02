import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

//        String inputString = sca.nextLine();
//        String[] inputStringArray = inputString.split("\\\\n");

//        String inputString = getUserString(sca);
//        String[] inputStringArray = inputString.split("\\\\n");

        String inputString = "";
        String nextLine = "";
        boolean isShipLost = true;

        while (sca.hasNextLine()) {
            nextLine = sca.nextLine();
            inputString += nextLine + "\n";
            if (nextLine.isEmpty()) {
                break;
            }
        }


//        inputString = inputString.trim();
//        System.out.println(inputString);

        String[] inputStringArray = inputString.split("\n");

//        System.out.println(Arrays.toString(inputStringArray));


//        List<String> patternList = new ArrayList<>();
//        int i = 0;
//        String row = "";
//
//        do {
//
//            row = sca.nextLine();
//            if (row.equals("q")) {
//                i--;
//                break;
//            }
//            patternList.add(i, row);
//            i++;
//
//        } while (true);
//
//        System.out.println(patternList);


//        List<String> patternList = new ArrayList<>(Arrays.asList(inputStringArray));

        for (int i = 0; i < inputStringArray.length; i++) {

            String locateX = inputStringArray[i];

            if (locateX.contains("X")) {
                isShipLost = false;
                int rowIndex = inputStringArray.length - i - 1;

                for (int j = 0; j < locateX.length(); j++) {
                    char c = locateX.charAt(j);
                    if (c == 'X') {
                        int columnIndex = j;
                        System.out.println("[" + columnIndex + "," + rowIndex + "]");
                    }

                }
            }
        }

        if (isShipLost) {
            System.out.println("Spaceship lost forever.");
        }

    }

//    public static String getUserString(Scanner keyboard) {
////        System.out.println("Enter Initial Text: ");
//        String input = "";
//        String line;
//        while (keyboard.hasNextLine()) {
//            line = keyboard.nextLine();
////            if (line.isEmpty()) {
////                break;
////            }
//            input += line; //+ "\n";
//        }
//        return input;
//    }


}
