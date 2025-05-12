public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,9};
        int i=0;
        int j=0;
        int k=5;
        int sum=0;
        int max=0;
        int ans=0;
        while(j<arr.length){
            sum=sum+arr[j];
            if(sum==k){
                ans=j-i+1;
                if(max<ans){
                    max=ans;
                }
            }
            while(sum>k){
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        System.out.println(max);
    }
}