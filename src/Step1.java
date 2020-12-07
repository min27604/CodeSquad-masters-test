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
    }
}
