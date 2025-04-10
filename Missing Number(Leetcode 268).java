class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int temp=0;
        int ans=0;
        while(i<nums.length){
            int count = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[count]){
                temp=nums[i];
                nums[i]=nums[count];
                nums[count]=temp;
            }
            else{i++;}
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] !=j){
                return j;
        
            }
        }
        return nums.length;
    }
}
