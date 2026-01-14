import java.util.*;
class SubsetSum1Recurssion {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        int[] arr = {3,2,1};
        solution(0,arr,0,list);
        System.out.println(list);

    }
    public static void solution(int index, int[] arr, int sum,List<Integer> list){
        if(index>=arr.length){
            list.add(sum);
            return;
        }
    
    solution(index+1,arr,sum+arr[index],list);
    solution(index+1,arr, sum, list);
    }
}