import java.util.Scanner;

public class Cube {
    String[][][] cube = new String[][][] {{{"W", "W", "W"}, {"W", "W", "W"}, {"W", "W", "W"}},
            {{"O", "O", "O"}, {"O", "O", "O"}, {"O", "O", "O"}}, {{"G", "G", "G"}, {"G", "G", "G"}, {"G", "G", "G"}},
            {{"R", "R", "R"}, {"R", "R", "R"}, {"R", "R", "R"}}, {{"B", "B", "B"}, {"B", "B", "B"}, {"B", "B", "B"}},
            {{"Y", "Y", "Y"}, {"Y", "Y", "Y"}, {"Y", "Y", "Y"}}};
    CubePrinter printer = new CubePrinter();
    Scanner sc = new Scanner(System.in);
    String input;
    int counter;

    void start() {
        printer.printCube(cube);
        while (true) {
            takeInputs();
            if (input.equals("Q")) {
                System.out.println("조작갯수: " + counter);
                System.out.println("이용해주셔서 감사합니다. 뚜뚜뚜.");
                break;
            }
            getDirection();
        }
    }

    private void takeInputs() {
        System.out.print("CUBE> ");
        input = sc.nextLine();
    }

    private void getDirection() {
        for (int i = 0; i < input.length(); i++) {
            String direction;

            if (input.charAt(i) == '\'') {
                continue;
            }

            if (input.charAt(i) == '2') {
                direction = specifyDoubleTurn(input, i);
            } else {
                direction = specifyReverse(input, i);
            }

            System.out.println(direction + "\n");
            moveCube(direction);
            counter++;
        }
    }

    private void moveCube(String direction) {
        direction = direction.toUpperCase();
        switch (direction) {
            case "F":
                printer.printCube(Move.front());
                break;
            case "F'":
                printer.printCube(Move.frontReverse());
                break;
            case "R":
                printer.printCube(Move.right());
                break;
            case "R'":
                printer.printCube(Move.rightReverse());
                break;
            case "U":
                printer.printCube(Move.up());
                break;
            case "U'":
                printer.printCube(Move.upReverse());
                break;
            case "B":
                printer.printCube(Move.back());
                break;
            case "B'":
                printer.printCube(Move.backReverse());
                break;
            case "L":
                printer.printCube(Move.left());
                break;
            case "L'":
                printer.printCube(Move.leftReverse());
                break;
            case "D":
                printer.printCube(Move.down());
                break;
            case "D'":
                printer.printCube(Move.downReverse());
                break;
        }
    }

    private String specifyReverse(String input, int i) {
        String tempDirection = "" + input.charAt(i);
        if ((i != input.length() - 1) && (input.charAt(i + 1) == '\'')) {
            tempDirection += input.charAt(i + 1);
        }
        return tempDirection;
    }

    private String specifyDoubleTurn(String input, int i) {
        String tempDirection = "";
        if (input.charAt(i - 1) == '\'') {
            tempDirection += input.charAt(i - 2);
            tempDirection += input.charAt(i - 1);
        } else {
            tempDirection += input.charAt(i - 1);
        }
        return tempDirection;
    }
}