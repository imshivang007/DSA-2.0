public class PlacingTiles {
    static int countWays(int n, int m){
        
        if(n < m) return 1; 
        if(n == m) return 2; 

        
        return countWays(n-1, m) + countWays(n-m, m);
    }
    public static void main(String args[]){
        int n = 4, m = 2;
        System.out.println("Number of ways to place tiles: " + countWays(n,m));
    }
}
