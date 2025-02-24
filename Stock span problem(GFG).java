
class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
      ArrayList<Integer> ans = new ArrayList<>();
      ans.add(1);
       for(int i=1;i<arr.length;i++){
             int count=1;
           for(int j=i-1;j>=0;j--){
               if(arr[i]>=arr[j]){
                   count++;
               }
               else{
                   break;
               }
               }
              ans.add(count);
           }
             return ans;
       }
      
    }
