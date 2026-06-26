class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>h1 = new HashMap<>();
        HashMap<Character,Integer>h2 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            h1.put(s1.charAt(i),h1.getOrDefault(s1.charAt(i),0)+1);
        }


        for(int i=0;i<s2.length()-s1.length()+1;i++){
            for(int j=i;j<i+s1.length();j++){
                h2.put(s2.charAt(j),h2.getOrDefault(s2.charAt(j),0)+1);
            }
            if(h1.equals(h2))
                return true;
            h2.clear();
        }

        return false;

    }
}
