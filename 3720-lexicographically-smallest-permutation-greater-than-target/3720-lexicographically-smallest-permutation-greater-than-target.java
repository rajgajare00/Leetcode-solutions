class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n=s.length();
        int[] count=new int[26];
        for(char ch: s.toCharArray()){
            count[ch-'a']++;
        }
        int[] cur=count.clone();
        int bestp=-1;
        char bestc=' ';
        int[] bestsnap=null;
        for(int i=0;i<n;i++){
            int t=target.charAt(i)-'a';
            int greaterl=-1;
            for(int c=t+1;c<26;c++){
                if(cur[c]>0){
                    greaterl=c;
                    break;
                }
            }
            if(greaterl!=-1){
                bestp=i;
                bestc=(char) (greaterl+'a');
                bestsnap=cur.clone();
            }
            if(cur[t]>0) cur[t]--;
            else break;
        }
        if(bestp==-1) return "";
        StringBuilder result=new StringBuilder();
        result.append(target,0,bestp);
        result.append(bestc);
        int[] remain=bestsnap.clone();
        remain[bestc-'a']--;
        for(int c=0;c<26;c++){
            for(int k =0;k<remain[c];k++){
                result.append((char) (c+'a'));
            }
        }
        return result.toString();
    }
}