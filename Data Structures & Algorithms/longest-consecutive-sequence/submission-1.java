class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int num:nums){
            s.add(num);
        }

        int maxLength=0;
        for(int num: s){
            if(!s.contains(num-1)){
                int c=1;
                int x=num;
                while(s.contains(x+1)){
                    c++;
                    x++;
                }
                maxLength=Math.max(c,maxLength);
            }
        }
        return maxLength;
    }
}
