public class Main{
    public static void main(String[] args){
        int arr[] = {2,3,2,3,1,4,4};
        int count =0;
        int value=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                
            }
            if(count==1){
                    System.out.println(arr[i]);
                }

            count=0;
        }
        

    }
}