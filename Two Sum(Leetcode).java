import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        outer:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if((nums[i]+nums[j]==target) && i!=j){
//                    arr.set(0,1); when the array already have element only set(index,value) can be used
//                    arr.set(1,j);
                   
                    return new int[]{i,j};
                   

                }
            }
        }
    return new int[]{};  
    }
}


