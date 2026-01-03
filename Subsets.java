import java.util.ArrayList;
public class Subsets {

    public static int printSubsets(int n,ArrayList<Integer> subset) {
        
        if(n==0){
            
            for(int i=0;i<subset.size();i++){
                System.out.print(subset.get(i)+" ");
            }
            System.out.println();
            return 1;
        }

        
        subset.add(n);
        int left = printSubsets(n-1,subset);
        
        subset.remove(subset.size()-1);
        int right = printSubsets(n-1,subset);

        return left + right;    
        
    }
    

    public static void main(String args[]) {
        int n=3;
        ArrayList<Integer> subset = new ArrayList<>();
        printSubsets(n,subset);
    }
}
