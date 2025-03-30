//package RecursionOnArrays;

public class SumOfElements {
    static int sumofelements(int [] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        
       return arr[idx] +sumofelements(arr, idx+1);



    }
    public static void main(String [] args){
        int [] arr={5,4,3,2};
    int ans= sumofelements(arr,0);
    System.out.println(ans);

    }
    
}
