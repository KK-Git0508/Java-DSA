/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        return helper(0,n);
    }
    public int helper(int st,int end){
        int mid=st+((end-st)/2);
        int x = guess(mid);
        if(x==0){
            return mid;
       }
       if(x==1){
        return helper(mid+1,end);
       }
       else
       {
        return helper(st,mid-1);
       }
    }
 }
