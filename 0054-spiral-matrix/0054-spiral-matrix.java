// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {

//         List<Integer> result = new ArrayList<>();
//         if (matrix == null || matrix.length == 0) {
//             return result;
//         }
//         int startRow = 0;
//         int endRow =  matrix.length - 1;
//         int startCol = 0;
//         int endCol = matrix[0].length - 1;

//         while(startRow <= endRow && startCol <= endCol){
//             // top
//             for(int j = startCol; j<=endCol; j++){
//                 result.add(matrix[startRow][j]);
//             }
//             // right
//             for(int i = startRow +1; i<=endRow; i++){
//                  result.add(matrix[i][endRow]);
//             }
//             // bottom 
//             // left          
//          }
//     }
// }/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // createa array list store the result
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols-1, top = 0, bottom = rows-1;
        
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return result;
    }
}