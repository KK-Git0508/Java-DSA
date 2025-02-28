class Solution {
    public int search(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
   
        return ans(nums,target,st,end);
    }
    public static int ans(int[] nums,int tar,int st,int end){
        int mid=(st+end)/2;
           if(st>end){return -1;}
        if(tar==nums[mid]){
            return mid;
        }
        else if(tar>nums[mid]){
            return ans(nums, tar, mid+1, end);
        }
        if(tar<nums[mid]){
            return ans(nums, tar, st, mid-1);
        }
    return -1;
    }
}
