class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> seen =new HashSet<>();

        for(int count:freq.values()){
            if(!seen.add(count)){
                return false;
            }
        }
        return true;
    }
}