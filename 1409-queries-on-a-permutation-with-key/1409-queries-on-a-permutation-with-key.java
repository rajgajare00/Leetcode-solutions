class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> P = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            P.add(i);
        }
        int[] result = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int q = queries[i];
            int index = P.indexOf(q); 
            result[i] = index;
            
            P.remove(index);
            P.add(0, q);    
        }
        
        return result;
    }
}