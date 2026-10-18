class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxlength = 0;
        Map<Character, Integer> vC = new HashMap<>();
        
        for(int right = 0, left = 0; right < s.length(); right++){
            char curChar = s.charAt(right);
            if(vC.containsKey(curChar) && vC.get(curChar) >= left){
                left = vC.get(curChar) + 1;
            }


            vC.put(s.charAt(right), right);
            maxlength = Math.max(maxlength, right-left+1);
        }
        return maxlength;
    }
}
