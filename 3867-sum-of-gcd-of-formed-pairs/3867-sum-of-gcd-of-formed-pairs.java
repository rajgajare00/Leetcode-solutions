class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        int max1=nums[0];
        for(int i=0;i<n;i++){
            max1=Math.max(max1,nums[i]);
            pre[i]=gcd(nums[i],max1);
        }
        Arrays.sort(pre);
        long sum=0;
        for(int i=0;i<n/2;i++){
            sum+=gcd(pre[i],pre[n-1-i]);
        }
        return sum;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}