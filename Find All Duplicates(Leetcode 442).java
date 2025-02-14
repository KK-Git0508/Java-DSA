class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> duplicate = new ArrayList<>();        
        for(int i:nums){
            if(map.containsKey(i)){
                duplicate.add(i);
            }
            else{
                map.put(i,1);
            }
        }
            
       return duplicate; 
    }
}
