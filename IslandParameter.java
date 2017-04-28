public class IslandParameter {

    public static int isIslandParameter(int[][] grid) {
        if (grid.length == 0 || grid == null) return 0;

        int count = 0,delecate = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count += 4;

                    if (i != 0) {
                        if (grid[i - 1][j] == 1) {
                            delecate++;
                        }
                    }
                    if (i != grid.length - 1) {
                        if (grid[i + 1][j] == 1) {
                            delecate++;
                        }
                    }
                    if (j != 0) {
                        if (grid[i][j - 1] == 1) {
                            delecate++;
                        }
                    }
                    if (j != grid[0].length - 1) {
                        if (grid[i][j + 1] == 1) {
                            delecate++;
                        }
                    }

                }

            }
        }
        return count - delecate;
    }
}
