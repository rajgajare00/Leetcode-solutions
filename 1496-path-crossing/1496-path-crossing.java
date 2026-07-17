class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visit=new HashSet<>();
        int x=0,y=0;
        visit.add(x+","+y);
        for(char c:path.toCharArray()){
            if(c=='N') y++;
            else if(c=='S') y--;
            else if(c=='E') x++;
            else if(c=='W') x--;
            String pos = x + "," + y;
            if (visit.contains(pos)) return true;
            visit.add(pos);
        }
        return false;
    }
}