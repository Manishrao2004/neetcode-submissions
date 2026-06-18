class Solution {
    public boolean anagram(String s1,String s2){
        if(s1.equals(s2))
            return true;

        if(s1.length() !=s2.length())
            return false;
        
        int freq[]= new int[26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0)
                return false;
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean visited[]= new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            if(visited[i])
                continue;

            List<String> li = new ArrayList<>(); 
            for(int j=i;j<strs.length;j++){
                if(anagram(strs[i],strs[j])){
                    visited[j]=true;
                    li.add(strs[j]);
                }
            }
            ans.add(li);
        }
        return ans;
    }
}
