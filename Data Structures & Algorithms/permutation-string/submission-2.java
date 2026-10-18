class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }

        for(int j = s1.length(); j < s2.length(); j++){
            
            char addChar = s2.charAt(j);
            map2.put(addChar, map2.getOrDefault(addChar, 0)+1);

            char removeChar = s2.charAt(j - s1.length());
            map2.put(removeChar, map2.getOrDefault(removeChar,0)-1);

            if(map2.get(removeChar) == 0){
                map2.remove(removeChar);
            }
            if(map1.equals(map2)){
                return true;
            }

        }
        return false;

    }
}
