class Solution {
    public int maxArea(int[] heights) {
        
        int maxheight = 0;
        int i = 0;
        int j = heights.length - 1;
        while(i<j){

            int height = Math.min(heights[i], heights[j]);
            int max = (j-i) * height;
            maxheight = Math.max(maxheight, max);

            if(heights[i]<heights[j]){
                i++;
            }
            else{
                j--;
            }



        }
        return maxheight;
    }
}
