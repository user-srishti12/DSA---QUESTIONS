class Solution {
    public int romanToInt(String s) {
        int[] val=new int[128];
        val['I']=1;
        val['V']=5;
        val['X']=10;
        val['L']=50;
        val['C']=100;
        val['D']=500;
        val['M']=1000;
        int result=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int current =val[s.charAt(i)];
            if(i<n-1 && current<val[s.charAt(i+1)]){
                result-=current;
            }
            else{result+=current;}
        }
        return result;
    }
}