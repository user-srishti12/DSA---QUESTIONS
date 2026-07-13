class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result =new ArrayList<>();
        for(int start=1;start<9;++start){
            int current=start;
            for(int nextdigit=start+1;nextdigit<10;++nextdigit){
                current=current*10+nextdigit;
                if(current>=low && current<=high){
                    result.add(current);
                }
            }
        }   

        
    Collections.sort(result);
    return result;
    }
}