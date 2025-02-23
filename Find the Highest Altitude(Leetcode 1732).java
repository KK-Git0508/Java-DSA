class Solution {
    public int largestAltitude(int[] gain) {
        int greater=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
            
            if(sum>greater){
                greater=sum;
            }
        }
             return greater;
        }
       
    }
