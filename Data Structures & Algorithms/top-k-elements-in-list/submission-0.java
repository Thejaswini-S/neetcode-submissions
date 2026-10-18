class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        //Coz if 4 time 1 is then index 4 if we fill it we dont have index 4 as the length is 3 which starts from 0 
        List<Integer> bucket[] = new ArrayList[nums.length+1];
        for(int i = 0; i < bucket.length; i++){
           bucket[i] = new ArrayList(); 
        }

        for(int key : map.keySet()){
            int freq = map.get(key);
            bucket[freq].add(key);
        }

        List<Integer> result = new ArrayList<>();

        for(int i = bucket.length-1; i>=0 && result.size()<k; i--){
            result.addAll(bucket[i]);
        }

        int res[] = new int[k];
        for(int i = 0; i<k; i++){
            res[i] = result.get(i);
        }
        return res;
    }
    
}
