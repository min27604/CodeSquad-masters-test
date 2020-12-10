import java.util.Scanner;

public class Cube {
    String[][] cube = {{"R", "R", "W"}, {"G", "C", "W"}, {"G", "B", "B"}};
    String inputs;

    public Cube() {
        init();
    }

    public void init() {
        printCube();
        while (true) {
            takeInputs();
            if (inputs.equals("Q")) {
                System.out.println("Bye~");
                break;
            }
            moveCube();
        }
    }

    private void printCube() {
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                System.out.print(cube[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void takeInputs() {
        System.out.print("CUBE> ");
        Scanner sc = new Scanner(System.in);
        inputs = sc.nextLine();
    }

    private void moveCube() {
        for (int i = 0; i < inputs.length(); i++) {
            String direction = "";
            if (inputs.charAt(i) == '\'') {
                continue;
            }
            direction += inputs.charAt(i);

            if ((i != inputs.length() - 1) && (inputs.charAt(i + 1) == '\'')) {
                direction += "'";
            }
            System.out.println(direction);
            matchDirection(direction);
            printCube();
        }
    }

    private void matchDirection(String direction) {
        switch (direction) {
            case "U":
                moveLeft(0);
                break;
            case "U'":
                moveRight(0);
                break;
            case "R":
                moveUp(2);
                break;
            case "R'":
                moveDown(2);
                break;
            case "L":
                moveDown(0);
                break;
            case "L'":
                moveUp(0);
                break;
            case "B":
                moveRight(2);
                break;
            case "B'":
                moveLeft(2);
                break;
        }
    }

    private void moveLeft(int index) {
        String temp = cube[index][0];
        for (int i = 0; i < cube[index].length - 1; i++) {
            cube[index][i] = cube[index][i + 1];
        }
        cube[index][cube[index].length - 1] = temp;
    }

    private void moveRight(int index) {
        String temp = cube[index][cube[index].length - 1];
        for (int i = cube[index].length - 1; i > 0; i--) {
            cube[index][i] = cube[index][i - 1];
        }
        cube[index][0] = temp;
    }

    private void moveUp(int index) {
        String temp = cube[0][index];
        for (int i = 0; i < cube.length - 1; i++) {
            cube[i][index] = cube[i + 1][index];
        }
        cube[cube.length - 1][index] = temp;
    }

    private void moveDown(int index) {
        String temp = cube[cube.length - 1][index];
        for (int i = cube.length - 1; i > 0; i--) {
            cube[i][index] = cube[i - 1][index];
        }
        cube[0][index] = temp;
    }
}
