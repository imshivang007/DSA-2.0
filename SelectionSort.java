public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String ar[]){
        int arr[] ={5,1,6,8,3};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
