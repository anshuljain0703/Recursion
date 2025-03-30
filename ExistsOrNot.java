//package RecursionOnArrays;

// public class ExistsOrNot {
//     static boolean exists(int [] arr,int idx,int target){
//         if(idx==arr.length){
//             return false;
//         }
//         if(arr[idx]==target){
//             return true;
//         }
//        return exists(arr,idx+1,target);
        
     



//     }
//     public static void main(String [] args){
//         int [] arr={5,4,3,2};
//      boolean ans=exists(arr,0,2);
//      System.out.println(ans);
    

//     }
    
// }
public class ExistsOrNot{
    public static int searchIndex(int [] arr,int idx,int target){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
return searchIndex(arr, idx+1, target);
  
    }
    public static boolean searchElement(int [] arr,int idx,int target){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
return searchElement(arr, idx+1, target);
  
    }
    public static void main(String[] args) {
        int arr[]={5,4,13,2,1,20};
        int target=4;
        System.out.println(searchElement(arr, 0, target));
     int idx=searchIndex(arr, 0, target); 
     System.out.println(idx);
     
    }
}

