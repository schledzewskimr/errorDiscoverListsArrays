import java.util.Scanner;
import java.util.ArrayList;
public class FifthItem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("enter a bunch of strings. enter nothing to continue");
        for (int i = 0; i < list.size()+1; i++) {
            String userInput = scanner.nextLine();
            if (userInput.isBlank()) {
                System.out.println("the fifth item is: " +list.get(4));
            } else {
                list.add(userInput);
            }
        }
    }
}
