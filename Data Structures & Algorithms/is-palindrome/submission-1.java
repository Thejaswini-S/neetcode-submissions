class Solution {
    public boolean isPalindrome(String s) {
        
        char[] c = s.toCharArray();

        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            if(!Character.isLetterOrDigit(c[l])){
                  l++;
                  continue;
            }
            if(!Character.isLetterOrDigit(c[r])){
                  r--;
                  continue;
            }
            if(Character.toLowerCase(c[l]) != Character.toLowerCase(c[r])){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

