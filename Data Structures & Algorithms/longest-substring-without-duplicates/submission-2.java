class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h= new HashSet<>();
        int maxLength=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                if(h.contains(ch))
                    break;
                
                h.add(ch);
                l++;
                maxLength=Math.max(l,maxLength);
            }
            h.clear();
            l=0;
        }

        return maxLength;
    }
}
