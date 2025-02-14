class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        int count=0;

        for(int i:nums1){
            set2.contains(i);
            count++;
        }
        int count1=0;
        for(int i:nums2){
            set1.contains(i);
            count1++;
        }
        return new int[]{count,count1};
    }
}
