import java.util.*;

class Main {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    
    
    int n=arr[arr.length-1];
    int value1 = n*(n+1)/2;
     
     
    int value2 = 0;
    for(int i=0;i<arr.length;i++){
       value2=arr[i]+value2;
     }
     int mis = value1 - value2;
     if(mis==0){
         System.out.println((arr.length)+1);
     }
     else{
     System.out.println(mis);
     }
    
    }
}