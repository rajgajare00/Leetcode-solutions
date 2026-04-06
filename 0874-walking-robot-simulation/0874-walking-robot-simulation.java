import java.util.*;

public class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // Directions: North, East, South, West
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int dir = 0; // start facing north
        int x = 0, y = 0;
        int maxDist = 0;

        // Store obstacles in a HashSet
        Set<String> obs = new HashSet<>();
        for (int[] o : obstacles) {
            obs.add(o[0] + "," + o[1]);
        }

        for (int cmd : commands) {
            if (cmd == -2) { // turn left
                dir = (dir + 3) % 4;
            } else if (cmd == -1) { // turn right
                dir = (dir + 1) % 4;
            } else { 
                for (int step = 0; step < cmd; step++) {
                    int nx = x + dirs[dir][0];
                    int ny = y + dirs[dir][1];
                    if (obs.contains(nx + "," + ny)) {
                        break; 
                    }
                    x = nx;
                    y = ny;
                    maxDist = Math.max(maxDist, x*x + y*y);
                }
            }
        }
        return maxDist;
    }
}
