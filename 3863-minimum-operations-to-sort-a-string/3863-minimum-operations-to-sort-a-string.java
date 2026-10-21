class Solution {
    public int minOperations(String s) {
        int n=s.length();
        boolean sorted =true ;
        for(int i=1;i<n;i++){
            if(s.charAt(i)<s.charAt(i-1)){
                sorted=false;
                break;
            }
        }
        if(sorted) return 0;
        if(n==2) return -1;
        char mn ='z';
        char nx='a';
        for(char c: s.toCharArray()){
            mn=(char)Math.min(mn,c);
            nx=(char)Math.max(nx,c);
        }
        if(s.charAt(0)==mn || s.charAt(n-1)==nx) return 1;
        for(int i=1;i<n-1;i++){
            char c=s.charAt(i);
            if(c==mn || c==nx) return 2;
        }
        return 3;
    }
}