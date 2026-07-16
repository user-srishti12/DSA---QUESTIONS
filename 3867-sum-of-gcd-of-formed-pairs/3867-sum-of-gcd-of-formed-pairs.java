import java.util.*;
class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
    int[] mxi=new int[n];
    int currentmax=nums[0];
    for(int i=0;i<nums.length;i++){
            currentmax=Math.max(currentmax,nums[i]);
            mxi[i]=currentmax;
        
    }
    int[] prefixgcd=new int[n];
    for(int i=0;i<n;i++){
    prefixgcd[i]=gcd(mxi[i],nums[i]);
    }
    Arrays.sort(prefixgcd);
    long sum = 0;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            sum += gcd(prefixgcd[left], prefixgcd[right]);
            left++;
            right--;
        }
        return sum;}
     public int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;

        
    }
}
