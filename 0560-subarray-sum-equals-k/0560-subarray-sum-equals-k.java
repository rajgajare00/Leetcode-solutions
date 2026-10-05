class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int presum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num: nums){
            presum+=num;
            int target=presum-k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}