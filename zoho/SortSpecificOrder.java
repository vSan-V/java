/*
Input: arr[] = [1, 2, 3, 5, 4, 7, 10]
Output: [7, 5, 3, 1, 2, 4, 10]
*/

import java.util.*;
class SortSpecificOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 7, 10};
        List<Integer> listOdd = new ArrayList<Integer>();
        List<Integer> listEven = new ArrayList<Integer>();
       
        for(int num : arr){
            if(num%2==0){
                listEven.add(num);
            }
            else if(num%2!=0){
                listOdd.add(num);
            }
        }
    Collections.sort(listOdd ,Collections.reverseOrder());
        Collections.sort(listEven);
        
        int oddLength = listOdd.size();
        int evenLength = listEven.size();
        
        for(int i=0;i<listOdd.size();i++){
            arr[i]= listOdd.get(i);
        }
        for(int i=0;i<listEven.size();i++){
            arr[i+listOdd.size()]= listEven.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}