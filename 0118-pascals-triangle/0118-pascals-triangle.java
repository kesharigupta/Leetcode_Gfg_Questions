class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        // base case
        if(numRows == 0){
            return result;
        }
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        
        
        for(int i =1; i<numRows; i++){
            List<Integer> prevRow = result.get(i - 1);
             // start next row
            
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j =1; j < i; j++){
                row.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            row.add(1);
            result.add(row);
        }        
        
        return result; 
        
    }
} 