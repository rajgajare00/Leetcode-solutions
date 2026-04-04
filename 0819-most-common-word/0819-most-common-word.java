class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        String[] words=paragraph.split("\\s+");
        Set<String> ban = new HashSet<>(Arrays.asList(banned));        
        String result="";
        int maxc=0;
        Map<String, Integer> freq = new HashMap<>();
        for( String word:words){
            if(!ban.contains(word) && word.length()>0){
                freq.put(word,freq.getOrDefault(word,0)+1);
                if(freq.get(word)>maxc){
                    maxc=freq.get(word);
                    result=word;
                }
            }
        }
        return result;
    }
}