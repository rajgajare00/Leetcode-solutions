class Solution {
    public int findComplement(int num) {
        // int m=1; // find no of bits
        // while(m<=num){
        //     m<<=1;
        // }
        // m-=1; // m is greater than num
        // return num ^ m ;
        int bitl=Integer.toBinaryString(num).length();
        int m=(1<<bitl)-1;
        return num ^ m ;
    }
}