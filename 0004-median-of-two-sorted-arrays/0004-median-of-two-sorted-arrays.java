import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergearray[]=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            mergearray[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            mergearray[nums1.length+j]=nums2[j];
        }
        // Arrays.toString(mergearray);
        Arrays.sort(mergearray);
        double element=0;
        
        int median =mergearray.length/2;
        if(mergearray.length%2 !=0){
            element =(double)mergearray[median];
        }
        else{
            element= (double)(mergearray[mergearray.length/2]+mergearray[mergearray.length/2 -1])/2.0;
        }
        
        return (double)element;
    }
}