public class Move {
    static Cube cb = new Cube();
    static String[][][] tempCube = new String[6][3][3];

    private static void setTempCube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    tempCube[i][j][k] = cb.cube[i][j][k];
                }
            }
        }
    }

    private static void setCbCube() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    cb.cube[i][j][k] = tempCube[i][j][k];
                }
            }
        }
    }

    static String[][][] front() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[3][i][0] = cb.cube[0][2][i];
            tempCube[0][2][i] = cb.cube[1][2 - i][2];
            tempCube[1][i][2] = cb.cube[5][0][i];
            tempCube[5][0][2 - i] = cb.cube[3][i][0];
        }
        rotateClockwise(2);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] frontReverse() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[0][2][i] = cb.cube[3][i][0];
            tempCube[1][2 - i][2] = cb.cube[0][2][i];
            tempCube[5][0][i] = cb.cube[1][i][2];
            tempCube[3][i][0] = cb.cube[5][0][2 - i];
        }
        rotateCounterClockwise(2);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] left() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[2][i][0] = cb.cube[0][i][0];
            tempCube[0][i][0] = cb.cube[4][2 - i][2];
            tempCube[4][i][2] = cb.cube[5][2 - i][0];
            tempCube[5][i][0] = cb.cube[2][i][0];
        }
        rotateClockwise(1);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] leftReverse() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[0][i][0] = cb.cube[2][i][0];
            tempCube[4][i][2] = cb.cube[0][2 - i][0];
            tempCube[5][i][0] = cb.cube[4][2 - i][2];
            tempCube[2][i][0] = cb.cube[5][i][0];
        }
        rotateCounterClockwise(1);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] right() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[4][i][0] = cb.cube[0][2 - i][2];
            tempCube[5][i][2] = cb.cube[4][2 - i][0];
            tempCube[2][i][2] = cb.cube[5][i][2];
            tempCube[0][i][2] = cb.cube[2][i][2];
        }
        rotateClockwise(3);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] rightReverse() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[0][i][2] = cb.cube[4][2 - i][0];
            tempCube[4][i][0] = cb.cube[5][2 - i][0];
            tempCube[5][i][2] = cb.cube[2][i][2];
            tempCube[2][i][2] = cb.cube[0][i][2];
        }
        rotateCounterClockwise(3);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] back() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[1][i][0] = cb.cube[0][0][2 - i];
            tempCube[0][2][i] = cb.cube[1][i][0];
            tempCube[3][i][2] = cb.cube[0][2][2 - i];
            tempCube[0][0][i] = cb.cube[3][i][2];
        }
        rotateClockwise(4);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] backReverse() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[0][0][i] = cb.cube[i][2 - i][0];
            tempCube[1][i][0] = cb.cube[0][2][i];
            tempCube[0][2][i] = cb.cube[3][2 - i][2];
            tempCube[3][i][2] = cb.cube[0][0][i];
        }
        rotateCounterClockwise(4);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] up() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[3][i][0] = cb.cube[4][0][2 - i];
            tempCube[2][0][i] = cb.cube[3][2 - i][0];
            tempCube[1][0][i] = cb.cube[2][0][i];
            tempCube[4][0][i] = cb.cube[1][0][i];
        }
        rotateClockwise(0);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] upReverse() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[4][0][i] = cb.cube[3][2 - i][0];
            tempCube[3][i][0] = cb.cube[2][0][2 - i];
            tempCube[2][0][i] = cb.cube[1][0][i];
            tempCube[1][0][i] = cb.cube[4][0][i];
        }
        rotateCounterClockwise(0);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] down() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[3][2][i] = cb.cube[2][2][i];
            tempCube[4][2][i] = cb.cube[3][2][i];
            tempCube[1][2][i] = cb.cube[4][2][i];
            tempCube[2][2][i] = cb.cube[1][2][i];
        }
        rotateClockwise(5);
        setCbCube();
        return cb.cube;
    }

    private static String[][][] downReverse() {
        setTempCube();
        for (int i = 0; i < 3; i++) {
            tempCube[2][2][i] = cb.cube[3][2][i];
            tempCube[3][2][i] = cb.cube[4][2][i];
            tempCube[4][2][i] = cb.cube[1][2][i];
            tempCube[1][2][i] = cb.cube[2][2][i];
        }
        rotateCounterClockwise(5);
        setCbCube();
        return cb.cube;
    }

    private static void rotateClockwise(int side) {
        for (int i = 0; i < 3; i++) {
            tempCube[side][i][2] = cb.cube[side][0][i];
            tempCube[side][2][i] = cb.cube[side][2 - i][2];
            tempCube[side][i][0] = cb.cube[side][2][i];
            tempCube[side][0][i] = cb.cube[side][2 - i][0];
        }
    }

    private static void rotateCounterClockwise(int side) {
        for (int i = 0; i < 3; i++) {
            tempCube[side][0][i] = cb.cube[side][i][2];
            tempCube[side][i][2] = cb.cube[side][2][2 - i];
            tempCube[side][2][i] = cb.cube[side][i][0];
            tempCube[side][i][0] = cb.cube[side][0][2 - i];
        }
    }
}
