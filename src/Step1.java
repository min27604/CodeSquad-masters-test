import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Step1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] temp = sc.nextLine().split(" ");
        sc.close();

        List<String> word = new ArrayList<>(Arrays.asList(temp[0].split("")));
        int num = Integer.parseInt(temp[1]);
        String direction = temp[2];

        if ((direction.equalsIgnoreCase("l") && num > 0) || (direction.equalsIgnoreCase("r") && num < 0)) {
            for (int i = 0; i < Math.abs(num); i++) {
                String tem = word.get(0);
                word.remove(0);
                word.add(tem);
            }
        }
        if ((direction.equalsIgnoreCase("r") && num > 0) || (direction.equalsIgnoreCase("l") && num < 0)) {
            for (int i = 0; i < Math.abs(num); i++) {
                String tem = word.get(word.size() - 1);
                word.remove(word.size() - 1);
                word.add(0, tem);
            }
        }

        for (String s : word) {
            System.out.print(s);
        }
    }
}
