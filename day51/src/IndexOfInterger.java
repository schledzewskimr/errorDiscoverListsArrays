import java.util.Scanner;
import java.util.ArrayList;
public class IndexOfInterger {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < list.size()+1; i++) {
            int item = scanner.nextInt();
            if (item == 0) {
                System.out.println("Done entering items");
                System.out.println("What number are you looking for?");
                int x = scanner.nextInt();
                for (int z = 0; z < list.size(); z++) {
                    if (list.get(z) == x) {
                        System.out.println(x + " is at index " + z);
                    }
                }

            } else {
                list.add(item);
            }
        }
    }
}
