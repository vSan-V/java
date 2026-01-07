
import java.util.*;    
class SingleElementSortedArray {
    public static void main(String[] args) {    
       int[] arr = {1,1,1,2,3,3,4,4,8,8};
       int check=0;
       for(int i=0;i<arr.length;i++){
           if(check==0 && arr[i]>check){
             	  check=arr[i];
           }
           else if(arr[i]==check){
               check=0;
           }
       }
       System.out.println(check);
    }
}