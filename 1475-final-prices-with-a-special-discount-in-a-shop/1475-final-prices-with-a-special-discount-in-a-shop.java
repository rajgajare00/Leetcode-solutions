class Solution {
    public int[] finalPrices(int[] prices) {
        
        int n=prices.length;
        int[] ans =prices.clone();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                int idx=st.pop();
                ans[idx]-=prices[i];
            }
            st.push(i);
        }
        return ans;

    }
}