class Solution {
    public int secondHighest(String s) {
        Set<Integer>  digits=new HashSet<>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                digits.add(c-'0');
            }
        }
        if(digits.size()<2) return -1;
        List<Integer> sorted =new ArrayList<>(digits);
        Collections.sort(sorted,Collections.reverseOrder());
        return sorted.get(1);

    }
}