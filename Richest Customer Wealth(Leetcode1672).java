class Solution {
    public static void maximumWealth(int[][] accounts) {
      int ans=0; 
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i =0; i < accounts.length;i++){
        int sum=0;
        for(int j =0;j<accounts[i].length;j++){
            sum=sum+accounts[i][j];
        }
        if(sum>ans){
            ans=sum;
        }  
      }
      return ans;
        
    }
