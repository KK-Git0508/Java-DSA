class Solution {
    public int firstMissingPositive(int[] nums) {
       // int[] a={1,3,4,5,6,7};
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int i = 1;
        while(set.contains(i)){
            i++;
        }
        return i;
    }
}
