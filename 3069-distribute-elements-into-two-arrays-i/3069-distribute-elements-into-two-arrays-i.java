import java.util.*;
class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int arr=2;arr<n;arr++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[arr]);
            }else{
                arr2.add(nums[arr]);
            }
        }
        arr1.addAll(arr2);
        int[] result=new int[arr1.size()];
        for(int i=0;i<arr1.size();i++){
            result[i]=arr1.get(i);
        }
        return result;
    }
}