class Solution {
    public static int[] getConcatenation(int[] nums){
    int k=0;
        int[] ans = new int[2*nums.length];
        outer:
        
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            if(i==nums.length-1){ 
                for(int j=nums.length;j<ans.length;j++){
                    
                    ans[j]=nums[k];
                    k++;
                }
               break outer;
            }
        
        }
        return ans;
    }
    }
