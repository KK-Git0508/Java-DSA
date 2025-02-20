class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] ch=sentence.toCharArray();
        
        HashMap<Character,Integer> map = new HashMap<>();
        int count=1;
    
        for(char ans:ch){
            if(map.containsKey(ans)){
                count++;
            }
            map.put(ans,count);
        }
        for(char i='a';i<='z';i++){
           if(!(map.containsKey(i) && (map.get(i) >= 1))){
              return false;
           }
       }
        return true;
        
    }
}
