class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int current = 0;
        int maxLength = 0;
        int length = 0;
        for(int num: set){
            if(!set.contains(num-1)){

                current = num;
                length = 1;

                while(set.contains(current+1)){
                    current++;
                    length++;
                }
            maxLength = Math.max(maxLength , length);
            }

        }
        return maxLength;
    }
}
