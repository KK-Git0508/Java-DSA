class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> tar = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            tar.add(index[i], nums[i]);
            // target[index[i]]=nums[i];
        }
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
        target[i]=tar.get(i);
        }
        return target;
    }
}
