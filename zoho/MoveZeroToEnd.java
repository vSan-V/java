
import java.util.*;    
class MoveAllZeroToEnd {
    public static void main(String[] args) {    
       int[] arr = {1, 2, 0, 0, 0, 0, 5, 0};
       int i=0;
       int j=arr.length-1;
       
       while(i<j){
           if(arr[i]!=0 && arr[j]==0){
               i++;
               j--;
           }
           else if(arr[i]!=0 && arr[j]!=0){
               i++;
           }
           else if(arr[i]==0 && arr[j]!=0){
               int swap = arr[i];
               arr[i]=arr[j];
               arr[j]=swap;
           }
           else if(arr[i]==0 && arr[j]==0){
               j--;
           }
       }
       System.out.println(Arrays.toString(arr));
    }
}