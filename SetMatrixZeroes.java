//https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/777/
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//You must do it in place.

class SetZeroes {
    public void setZeroes(int[][] matrix) {
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        //Check first row contains 0
        for(int c = 0; c<col; c++) {
            if(matrix[0][c] == 0) {
                firstRowHasZero = true;
            }
        }
        
        //Check first column contains 0
        for(int r = 0; r<row; r++) {
            if(matrix[r][0] == 0) {
                firstColHasZero = true;
            }
        }
        
        //Loop and update rows first element - matrix[r][0] matrix[0][c]
        for(int r = 0; r<row ; r++) {
            for(int c= 0; c<col; c++) {
                if(matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }
        
        //Set values to zero
        for(int r = 1; r<row ; r++) {
            for(int c= 1; c<col; c++) {
                if(matrix[0][c] == 0) {
                    matrix[r][c] = 0;
                }
                if(matrix[r][0] == 0) {
                    matrix[r][c] = 0;
                }
            }
        }
        
        //set row / col to zero based on flag
        if(firstRowHasZero) {
            for(int c = 0; c<col; c++) {
                matrix[0][c] = 0;
            }
        }
        
        if(firstColHasZero) {
            for(int r = 0 ; r<row; r++) {
                matrix[r][0] = 0;
            }
        }
        
        
    }
}
