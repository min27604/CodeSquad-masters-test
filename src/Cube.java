import java.util.Scanner;

public class Cube {
    String[][][] cube = {{{"W", "W", "W"}, {"W", "W", "W"}, {"W", "W", "W"}},
            {{"O", "O", "O"}, {"O", "O", "O"}, {"O", "O", "O"}}, {{"G", "G", "G"}, {"G", "G", "G"}, {"G", "G", "G"}},
            {{"R", "R", "R"}, {"R", "R", "R"}, {"R", "R", "R"}}, {{"B", "B", "B"}, {"B", "B", "B"}, {"B", "B", "B"}},
            {{"Y", "Y", "Y"}, {"Y", "Y", "Y"}, {"Y", "Y", "Y"}}};
    CubePrinter printer = new CubePrinter();
    Scanner sc = new Scanner(System.in);
    String input;
    int counter;

    public Cube() {
        start();
    }

    private void start() {
        printer.printCube(cube);
        while(true) {
            takeInputs();
            if (input.equals("Q")) {
                System.out.println("조작갯수: " + counter);
                System.out.println("이용해주셔서 감사합니다. 뚜뚜뚜.");
                break;
            }
        }
    }

    private void takeInputs() {
        System.out.print("CUBE> ");
        input = sc.nextLine();
    }
}