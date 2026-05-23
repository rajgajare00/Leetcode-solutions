class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> tar=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            tar.add(index[i],nums[i]);
        }
        int[] result=new int[tar.size()];
        for(int i=0;i<tar.size();i++){
            result[i]=tar.get(i);
        }
        return result;
    }
}