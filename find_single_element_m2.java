public class Main{
    public static void main(String[] args){
        int arr[] = {2,3,2,4,4};
        int add=0;
        for(int i=0;i<arr.length;i++){
            add=arr[i]^add;
        }
        System.out.println(add);

    }
}