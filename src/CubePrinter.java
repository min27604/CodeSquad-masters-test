public class CubePrinter {

    void printCube(String[][][] cube) {
        printUp(cube);
        printMiddle(cube);
        printDown(cube);
    }

    private void printUp(String[][][] cube) {
        for (int i = 0; i < cube[0].length; i++) {
            System.out.print("\t\t");
            for (int j = 0; j < cube[0][i].length; j++) {
                System.out.print(cube[0][i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private void printMiddle(String[][][] cube) {
        for (int j = 0; j < 3; j++) {
            for (int i = 1; i < cube.length - 1; i++) {
                printMiddle2(cube, i, j);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private void printMiddle2(String[][][] cube, int i, int j) {
        for (int k = 0; k < cube[i][j].length; k++) {
            System.out.print(cube[i][j][k] + " ");
        }
    }

    private void printDown(String[][][] cube) {
        for (int i = 0; i < cube[cube.length - 1].length; i++) {
            System.out.print("\t\t");
            for (int j = 0; j < cube[cube.length - 1][i].length; j++) {
                System.out.print(cube[cube.length - 1][i][j] + " ");
            }
            System.out.println("");
        }
    }

}
