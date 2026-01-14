//Print all permutation with no extra space.
import java.util.*;
class PrintAllPermutaion2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        solution(0,arr,ans);
        System.out.println(ans);


    }
    public static void solution(int index, int[] arr, List<List<Integer>> ans){
        if(index == arr.length){
            //copy the ds to ans
            List<Integer> ds = new ArrayList<>();

            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i= index;i<arr.length;i++){
            swap(i,  index, arr);
            solution(index+1, arr, ans);
            swap(i, index, arr);
        }
    }
    public static void swap(int i, int j, int[] arr){
        int t =arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}