import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < list.size() + 1; i++) {
            int item = scanner.nextInt();
            if (item == 0) {
                for (int j = 0; j < list.size(); j++) {
                    if (j - (list.size() - 1) != 0) {
                        System.out.print(list.get(j) + ", ");
                    } else {
                        System.out.println("and " + list.get(j) + " were the numbers you entered.");
                        sum(list);
                    }
                }
            } else {
                list.add(item);
            }
        }
    }

    public static void sum(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int q = 0; q < list.size(); q++) {
            total += list.get(q);
        }
        System.out.println("The sum of all these is: " + total);
        System.out.println("What number are you looking for?");
        int x = scanner.nextInt();
        for (int z = 0; z < list.size(); z++) {
            if (list.get(z) == x) {
                System.out.println(x + " is at index " + z);
            }
        }
    }
}