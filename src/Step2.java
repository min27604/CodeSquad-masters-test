import java.util.Scanner;

public class Step2 {
    String[][] cube = {{"R", "R", "W"}, {"G", "C", "W"}, {"G", "B", "B"}};
    String input;
    boolean running;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Step2 step = new Step2();
        step.init(in);
    }

    public void printCube(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void init(Scanner in) {
        printCube(cube);
        running = true;
        while (running) {
            setInput(in);
            moveCube();
        }
    }

    public void setInput(Scanner in) {
        System.out.print("CUBE> ");
        input = in.nextLine();
        if (input.equalsIgnoreCase("Q")) {
            System.out.println("Bye~");
            running = false;
        }
    }

    public void moveCube() {
        for (int i = 0; i < input.length(); i++) {
            String direction = "";
            if (input.charAt(i) == '\'') {
                continue;
            }
            direction += input.charAt(i);

            if ((i != input.length() - 1) && (input.charAt(i + 1) == '\'')) {
                direction += "'";
            }
            System.out.println(direction);
            matchDirection(direction);
            printCube(cube);
        }
    }

    public void matchDirection(String direction) {
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

    public void moveLeft(int index) {
        String temp = cube[index][0];
        for (int i = 0; i < cube[index].length - 1; i++) {
            cube[index][i] = cube[index][i + 1];
        }
        cube[index][cube[index].length - 1] = temp;
    }

    public void moveRight(int index) {
        String temp = cube[index][cube[index].length - 1];
        for (int i = cube[index].length - 1; i > 0; i--) {
            cube[index][i] = cube[index][i - 1];
        }
        cube[index][0] = temp;
    }

    public void moveUp(int index) {
        String temp = cube[0][index];
        for (int i = 0; i < cube.length - 1; i++) {
            cube[i][index] = cube[i + 1][index];
        }
        cube[cube.length - 1][index] = temp;
    }

    public void moveDown(int index) {
        String temp = cube[cube.length - 1][index];
        for (int i = cube.length - 1; i > 0; i--) {
            cube[i][index] = cube[i - 1][index];
        }
        cube[0][index] = temp;
    }
}

