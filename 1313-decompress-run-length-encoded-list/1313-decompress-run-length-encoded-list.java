// class Solution {
//     public int[] decompressRLElist(int[] nums) {
//         List<Integer> list=new ArrayList<>();
//         for(int i=0;i<nums.length;i+=2){
//             int freq=nums[i];
//             int val=nums[i+1];
//             for(int j=0;j<freq;j++){
//                 list.add(val);
//             }
//         }
//         int[] ans=new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             ans[i]=list.get(i);
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i += 2) {
            n += nums[i];
        }
        int[] ans = new int[n];
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            while (freq-- > 0) {
                ans[index++] = val;
            }
        }
        return ans;
    }
}