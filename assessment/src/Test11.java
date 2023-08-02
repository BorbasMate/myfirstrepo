import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        String inputSting = sca.nextLine();
        int numberOfCopies = sca.nextInt();

        System.out.println(inputSting.repeat(numberOfCopies));

    }
}
