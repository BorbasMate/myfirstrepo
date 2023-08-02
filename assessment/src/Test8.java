import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        int oscar = sca.nextInt();

        if (oscar == 88) {
            System.out.println("Leo finally won the oscar! Leo is happy.");
        } else if (oscar == 86) {
            System.out.println("Not even for Wolf of wallstreet?!");
        } else if (oscar < 88) {
            System.out.println("When will you give Leo an Oscar?");
        } else {
            System.out.println("Leo got one already!");
        }


    }
}
