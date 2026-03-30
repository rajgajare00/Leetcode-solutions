class Solution {
    public boolean checkStrings(String s1, String s2) {
        List<Character> e1=new ArrayList<>();
        List<Character> e2=new ArrayList<>();
        for(int i=0;i<s1.length();i+=2){
           e1.add(s1.charAt(i));
           e2.add(s2.charAt(i));
        }
        List<Character> o2=new ArrayList<>();
        List<Character> o1=new ArrayList<>();
        for(int i=1;i<s1.length();i+=2){
            o1.add(s1.charAt(i));
            o2.add(s2.charAt(i));        
        }
        call(e1);
        call(e2);
        call(o1);
        call(o2);
        return e1.equals(e2) && o1.equals(o2);
    }
    public static void call(List<Character> ch){
        Collections.sort(ch);
        // return ch;
    }
}