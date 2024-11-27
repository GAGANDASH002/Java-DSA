// Count the number of possible ways to reach [N-1][M-1] from [0][0]
// U can only move down or right
class Grid{
    public static int gridWays(int i, int j, int n, int m){
        // If we reach the last cell 
        if(i == n-1 && j == m-1){
            return 1;
        } else if(i == n || j == n){ // boundary cross condition
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        return w1 + w2;

    }

    public static void main(String args[]){
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}