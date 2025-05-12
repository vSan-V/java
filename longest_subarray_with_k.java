public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,1,1,1,1};
        int k=5;
        int sum=0;
        int max=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==k){
                    ans=j-i+1;
                    if(max<ans){
                        max=ans;
                    }
                    break;
                }
            }
            sum=0;
        }
        System.out.println(max);
    }
}