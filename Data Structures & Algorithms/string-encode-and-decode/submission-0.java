class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();
        for(String str : strs){
            s.append(str.length()).append("#").append(str);
        }
        return s.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> result = new ArrayList<>();
        int s = str.length();
        while(i < s){

            int j = i;
           while( str.charAt(j) != '#'){
                j++;
           }
            int length = Integer.parseInt(str.substring(i,j));

            result.add(str.substring(j+1, j+1+length));

            i = j+1+length;

        }
        return result;
    }
}
