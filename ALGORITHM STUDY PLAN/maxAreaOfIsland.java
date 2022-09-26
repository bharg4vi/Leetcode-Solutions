class Solution {
     public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        int r = grid.length, c = grid[0].length;
        boolean[][] visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int current = grid[i][j];
                if (current == 1 && !visited[i][j]) {
                    result = Math.max(result, calculateArea(i, j, visited, grid));
                }
            }
        }

        return result;
    }

    public int calculateArea(int i, int j, boolean[][] visited, int[][] grid) {
        if (i == -1 || i == grid.length || j == -1 || j == grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        visited[i][j] = true;

        return 1 + calculateArea(i - 1, j, visited, grid)
                + calculateArea(i + 1, j, visited, grid)
                + calculateArea(i, j - 1, visited, grid)
                + calculateArea(i, j + 1, visited, grid);
    }
}
