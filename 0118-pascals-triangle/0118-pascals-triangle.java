class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows<=0)
            return new ArrayList();
        List<List<Integer>> result = new ArrayList();
         List<Integer> pre = null;
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList();
           
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                    // row.add(pre.get(j-1)+pre.get(j));
                }
               
            }
            pre = row;
             result.add(row);
        }
        return result;
    }
}