class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])); //sort starting points in inc                                                                     order
        ArrayList<int[]> list = new ArrayList<>(); 
        
        for(int [] interval: intervals){  //running loop, each interval is an array [start][end]
            if(list.size()==0){
                list.add(interval);
            }else{
                int [] prevInterval = list.get(list.size()-1); //previous interval 
                
                if(interval[0]<=prevInterval[1]){ 
                    //this means overlapping is there, new interval start < prev interval end point, then merging is there
                    prevInterval[1] = Math.max(interval[1], prevInterval[1]); //updata with bigger end point in
                }else{
                    list.add(interval); //if no overlapping then add that interval into arraylist list
                }
            }
        }
        
        return list.toArray(new int[list.size()][]); //converting arraylist to 2d array bcz it is required to return
    }
}