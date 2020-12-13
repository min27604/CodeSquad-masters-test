import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Shuffle {
    static String[] cubeElements = {"W", "W", "W", "W", "W", "W", "W", "W", "W",
            "O", "O", "O", "O", "O", "O", "O", "O", "O", "G", "G", "G", "G", "G", "G", "G", "G", "G",
            "R", "R", "R", "R", "R", "R", "R", "R", "R", "B", "B", "B", "B", "B", "B", "B", "B", "B",
            "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y", "Y"};
    static String[][][] shuffledCube = new String[6][3][3];

    static void setShuffledCube() {
        List<String> potentialCubeElements = Arrays.asList(cubeElements);
        Collections.shuffle(potentialCubeElements);

        int index = 0;
        for (int i = 0; i < shuffledCube.length; i++) {
            for (int j = 0; j < shuffledCube[i].length; j++) {
                for (int k = 0; k < shuffledCube[i][j].length; k++) {
                    shuffledCube[i][j][k] = potentialCubeElements.get(index);
                    index++;
                }
            }
        }
    }
}
