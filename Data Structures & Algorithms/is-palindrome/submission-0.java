class Solution {
    public boolean isPalindrome(String s) {
       int l = 0;
       int r = s.length()-1;
       char c[] = s.toCharArray();
       while(l<r){

            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }

           if(Character.toLowerCase(c[l]) != Character.toLowerCase(c[r]) ){
           return false;
           } 
           l++;
           r--;
       } 
       return true;
    }
}

