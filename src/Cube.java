public class Cube {
    String[][][] cube = {{{"W", "W", "W"}, {"W", "W", "W"}, {"W", "W", "W"}},
            {{"O", "O", "O"}, {"O", "O", "O"}, {"O", "O", "O"}}, {{"G", "G", "G"}, {"G", "G", "G"}, {"G", "G", "G"}},
            {{"R", "R", "R"}, {"R", "R", "R"}, {"R", "R", "R"}}, {{"B", "B", "B"}, {"B", "B", "B"}, {"B", "B", "B"}},
            {{"Y", "Y", "Y"}, {"Y", "Y", "Y"}, {"Y", "Y", "Y"}}};
    CubePrinter printer = new CubePrinter();

    public Cube() {
        init();
    }

    private void init() {
        printer.printCube(cube);
    }
}