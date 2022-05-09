import java.util.Scanner;
import java.util.ArrayList;
public class LastItem {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();


        for (int i = 0; i < list.size()+1; i++) {
            String item = scanner.nextLine();
            if (item.isBlank()) {
                int x = list.size()-1;
                System.out.println("the last is: " + list.get(x));
            } else {
                list.add(item);
            }
        }
    }
}
