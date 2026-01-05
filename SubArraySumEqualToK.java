public class SubArraySumEqualToK {

    public static int subArraySum(int[] arr, int k) {
        int count = 0;
        int sum = 0;
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, 1); 
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return count; 
    }   

    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;
        System.out.println("Count of subarrays is: " + subArraySum(arr, k));
    }
}
