class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        //used for each loop to iterate through string elements 
        for(String w:strs){
            while(!w.startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
    return prefix;
    }
}
