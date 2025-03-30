public class SumSubset {
    static void sumsubset(int[] a, int n, int idx, int sum) {
        // Base case: if index reaches the length of the array, print the sum
        if (idx >= n) {
            System.out.println(sum);
            return;
        }

        // Recursive call excluding the current element
        sumsubset(a, n, idx + 1, sum);

        // Recursive call including the current element
        sumsubset(a, n, idx + 1, sum + a[idx]);
    }

    public static void main(String[] args) {
        int[] a = {2, 3};
        int n = a.length;

        sumsubset(a, 
        
        
        
        
        
        
        
        
        
        
        
        n, 0, 0);
    }
}
