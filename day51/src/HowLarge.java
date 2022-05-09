import java.util.Scanner;
import java.util.ArrayList;
public class HowLarge {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();


        for (int i = 0; i < list.size()+1; i++) {
            String item = scanner.nextLine();
            if (item.isBlank()) {
                System.out.println("total amount of items is: " + list.size() );
            } else {
                list.add(item);
            }
        }
    }
}
