class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count1=0;
        int count2=0;
        for(int s: students){
            if(s==0) count1++;
            else count2++;
        }
        for(int s:sandwiches){
            if(s==0){
                if(count1==0) return count2;
                count1--;
            }
            else{
                if(count2==0) return count1;
                count2--;
            }
        }
        return 0;
    }
}