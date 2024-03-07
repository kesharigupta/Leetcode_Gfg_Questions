import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j =0;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> intersec = new ArrayList<>();
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if (nums1[i] > nums2[j]){
                j++;
            }
            else {
                intersec.add(nums1[i]);
                i++;
                j++;
            }
        }
        int result[] =  new int[intersec.size()];
        for(int k =0; k < intersec.size(); k++){
            result[k] = intersec.get(k);
        }
        return result;
    }
}