class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character,Integer > m1= new HashMap<>();
        HashMap<Character,Integer > m2= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            m2.put(t.charAt(i),m2.getOrDefault(t.charAt(i),0)+1);
        }

        // for(char c : m1.keySet()){
        //     if(! m1.get(c).equals(m2.get(c))){
        //         return false;
        //     }
        // }
        // return true;
        return m1.equals(m2);
}
}
