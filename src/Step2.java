import java.util.Scanner;

public class Step2 {
    String[][] cube = {{"R", "R", "W"}, {"G", "C", "W"}, {"G", "B", "B"}};

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

    public void moveLeft(int index) {
        String temp = cube[index][0];
        for (int i = 0; i < cube[index].length - 1; i++) {
            cube[index][i] = cube[index][i + 1];
        }
        cube[index][cube[index].length] = temp;
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Step2 step = new Step2();
        step.init(in);
    }
}

