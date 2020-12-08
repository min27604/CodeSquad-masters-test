import java.util.Scanner;

public class Step2 {
    public void printArr(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void init(Scanner in) {
        String[][] cube = {{"R", "R", "W"}, {"G", "C", "W"}, {"G", "B", "B"}};
        printArr(cube);
        takeInputs(in);
    }

    public void takeInputs(Scanner in) {
        System.out.print("CUBE> ");
        String input = in.nextLine();
        if (input.equalsIgnoreCase("Q")) {
            System.out.println("Bye~");
        } else {
            // TODO: MAKE METHOD THAT MOVES THE CUBE ACCORDING TO THE DIRECTION(INPUT)
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Step2 step = new Step2();
        step.init(in);
    }
}

