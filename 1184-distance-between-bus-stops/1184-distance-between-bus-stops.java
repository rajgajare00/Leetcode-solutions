class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int clock=0;
        for(int i=start;i<destination;i++){
            clock+=distance[i];
        }
        int total=0;
        for(int d:distance){
            total+=d;
        }
        int counter=total-clock;
        return Math.min(clock,counter);
    }
}