class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int n = t.length;
        int result[] = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!stack.empty() && t[i] >= t[stack.peek()]){
               
                    stack.pop();
                }
            
            if(!stack.empty()){
                result[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        return result;
    }
}
