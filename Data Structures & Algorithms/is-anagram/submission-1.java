class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        for(char c : sArray){
            h1.put(c, h1.getOrDefault(c,0)+1);
        }
        for(char c : tArray){
            h2.put(c, h2.getOrDefault(c,0)+1);
        }

        return (h1.equals(h2));
    
    }
}
