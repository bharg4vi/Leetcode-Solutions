class Solution {
   void rotate(int[][] matrix) {

        int length = matrix.length;
        Queue<Integer> q = new LinkedList<>();
        int j = 0;
        while (length != 0) {
            for (int i = matrix.length - 1; i >= 0; i--) 
            {
                int val = matrix[i][j];
                q.add(val);
            }
            j++;
            length--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                matrix[i][k] = q.poll();
            }
        }

    }
}
