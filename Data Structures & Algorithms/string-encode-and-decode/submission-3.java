class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
        int n = str.length();
        sb.append(n).append("#").append(str);
    }
    return sb.toString();
}
 public List<String> decode(String s) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {

            // Find the '#'
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            // Extract length
            int length = Integer.parseInt(s.substring(i, j));

            // Start of actual string
            int start = j + 1;

            // Extract exactly 'length' characters
            String str = s.substring(start, start + length);

            result.add(str);

            // Move to next encoded string
            i = start + length;
        }

        return result;
    }

}
