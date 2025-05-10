import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1!=arr[i+1]){
                System.out.println(arr[i]+1);
            }
          
        }
          System.out.println((arr.length)+1);
    }
}