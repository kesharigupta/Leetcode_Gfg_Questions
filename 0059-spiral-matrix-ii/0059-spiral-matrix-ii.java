class Solution {
    public int[][] generateMatrix(int n) {
        int [][] result = new int [n][n];
        int num = 1;
        int left =0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int d =0;
    while(left <= right && top <= bottom){
        if(d==0){
            for(int i =left; i<=right; i++){
                result[top][i] = num;
                num++;
            }
            d = 1; top++;
        }else if(d==1){
            for(int i =top; i<=bottom; i++){
                result[i][right] = num;
                num++;
            }
            d=2; right--;
        }else if(d==2){
            for(int i =right; i>=left; i--){
                result[bottom][i] = num;
                num++;
            }
            d = 3; bottom --;
        }else if(d==3){
            for(int i =bottom; i>=top; i--){
                result[i][left] = num;
                num++;
            }
            d = 0; left++;
        }   
    }
           return result;
    }
}