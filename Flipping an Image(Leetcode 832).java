class Solution {
    public static int[][] flipAndInvertImage(int[][] images) {
    for(int i=0;i<images.length;i++){
        int st=0;
        int end=images[0].length-1;
        int temp=0;
       while(st<=end){
                temp=images[i][st] ^ 1;
                images[i][st]=images[i][end] ^ 1;
                images[i][end]=temp;
               st++;
               end--;
        }
    }
    
    return images;
        
    }
}
