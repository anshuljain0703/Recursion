public class Index {
    // static int index(int[] arr, int idx, int target) {
    //     // Base case: if the index reaches the length of the array, the target was not found
    //     if (idx == arr.length) {
    //         return -1;
    //     }

    //     // If the target is found at the current index, return the index
    //     if (arr[idx] == target) {
    //         return idx;
    //     }

    //     // Recursive call to check the next index
    //     return index(arr, idx + 1, target);
    // }
    public static int findAllIndices(int [] arr,int idx,int target){
        if(idx==arr.length)
        return -1;
      if(arr[idx]==target){
        System.out.println(idx); 
      }
        return findAllIndices(arr, idx+1, target);

    }

    public static void main(String[] args) {
        int[] arr = {2,5, 4, 2,2, 2};
        int target = 2;
        int ans=findAllIndices(arr, 0, target);
       // int result = index(arr, 0, target);
        
        // if (result != -1) {
        //     System.out.println("The target is found at index: " + result);
        // } else {
        //     System.out.println("The target is not in the array.");
        // }
    }
}
