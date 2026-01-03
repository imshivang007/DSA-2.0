public class SortedArray {
    public static boolean calcSortedArray(int [] array, int index){
        if(index == array.length - 1){
            return true;
        }
        if(array[index] <= array[index + 1]){
            return calcSortedArray(array, index + 1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        boolean result =calcSortedArray(array,0);
        System.out.println("Is the array sorted? " + result);
    }
}
