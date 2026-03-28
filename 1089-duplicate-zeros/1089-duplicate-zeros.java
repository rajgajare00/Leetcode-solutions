class Solution {
    public void duplicateZeros(int[] arr) {
        int count=0;
        int n =arr.length;
        for(int i=0;i<n;i++){// count all zeros freq
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(i+count<n){
                arr[i+count]=arr[i];
            }
            if(arr[i]==0){
                count--;
                if(i+count<n) arr[i+count]=0;
            }
        }
    }
}