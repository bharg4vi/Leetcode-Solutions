class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        boolean[][] fillMap = new boolean[m][n];
        
        dfs(image, fillMap, image[sr][sc], sr, sc);
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (fillMap[r][c]) image[r][c] = color;
            }
        }
        
        return image;
    }
    
    private void dfs(int[][] image, boolean[][] fillMap, int startingColor, int r, int c) {
        if (r < 0 || c < 0 || r > image.length-1 || c > image[r].length-1) {
            return;
        }
        if (fillMap[r][c] || image[r][c] != startingColor || image[r][c] == -1) return;
        
        fillMap[r][c] = true;
        
        int temp = image[r][c];
        
        image[r][c] = -1;
        
        dfs(image, fillMap, startingColor, r+1, c);
        dfs(image, fillMap, startingColor, r-1, c);
        dfs(image, fillMap, startingColor, r, c+1);
        dfs(image, fillMap, startingColor, r, c-1);
        
        image[r][c] = temp;
    }
}
