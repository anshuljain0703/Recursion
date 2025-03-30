// public class MaxElement {
//     static int maxelement(int[] arr, int idx) {
//         // Base case: if index reaches the end of the array, return minimum integer value
//         if (idx == arr.length) {
//             return Integer.MIN_VALUE;
//         }

//         // Recursive call to find the maximum in the rest of the array
//         int smallans = maxelement(arr, idx + 1);

//         // Return the maximum of the current element and the result from the recursive call
//         return Math.max(arr[idx], smallans);
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 10, 2, 3, 5};
//         int max = maxelement(arr, 0);
//         System.out.println("The maximum element is: " + max);
//     }
// }
public class MaxElement{
    public static int printingMaxElement(int []arr,int idx){
        if(idx==arr.length)
        return 0;
        int selfwork=arr[idx];
        int smallans=printingMaxElement(arr, idx+1);
        if(selfwork<smallans){
            return smallans;
        }
        return selfwork;
    }
    public static void main(String[] args) {
        int arr[]={1,20,3,4,15};
     int mx=   printingMaxElement(arr, 0);
     System.out.println(mx);

    }

}
