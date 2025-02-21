class Solution {
    // public static int count = 0;

    public int numberOfSteps(int num) {
            return helper(num,0);
    }
    public int helper(int num,int count){
        if (num != 0) {
            if (num % 2 == 0) {
                return helper(num / 2,++count);
            } else {  
                return helper(num - 1,++count);
            }
        }
    return count;    
    }
}
