import java.util.*;

public class Test10 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        List<String> cardList = new ArrayList<>();

        String input = sca.nextLine();
        cardList = Arrays.asList(input.split(" "));

//        System.out.println(cardList);

        List<Integer> cardListInt = new ArrayList<>();

        for (int i = 0; i < cardList.size(); i++) {
           String changeToInt = cardList.get(i);
            switch (changeToInt) {
                case "A":
                    cardListInt.add(1);
                    break;
                case "T":
                    cardListInt.add(10);
                    break;
                case "J":
                    cardListInt.add(11);
                    break;
                case "Q":
                    cardListInt.add(12);
                    break;
                case "K":
                    cardListInt.add(13);
                    break;
                default:
                    cardListInt.add(Integer.parseInt(changeToInt));
            }
        }

//        System.out.println(cardListInt);
        Collections.sort(cardListInt);
//        System.out.println(cardListInt);


        for (int i = 0; i < cardListInt.size(); i++) {
            int changeToSting = cardListInt.get(i);
            switch (changeToSting) {
                case 1:
                    cardList.set(i, "A");
                    break;
                case 10:
                    cardList.set(i, "T");
                    break;
                case 11:
                    cardList.set(i, "J");
                    break;
                case 12:
                    cardList.set(i, "Q");
                    break;
                case 13:
                    cardList.set(i, "K");
                    break;
                default:
                    cardList.set(i, String.valueOf(changeToSting));
            }
        }

        for (String s : cardList) {
            System.out.print(s + " ");
        }
    }
}
