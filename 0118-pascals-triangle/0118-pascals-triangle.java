class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows<=0)
            return new ArrayList();
        List<List<Integer>> result = new ArrayList();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList();
           //2nd row 2 col, 3rd row have 3col and so on.. 
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){ //since first and last elem of row have 1
                    row.add(1);
                }else{
                    //since every element other then first and last of row is sum of it's                           [row-1][j-1] + [row][j] elem
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
               
            }
             result.add(row);
        }
        return result;
    }
}