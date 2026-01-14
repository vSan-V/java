class CountSubArrayK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1};
        int k=2;
        int x=4;

        int i=0;
        int j=0;
        int sum=0;
        int ans=0;
        while(j<arr.length){
            sum = sum+arr[j];
            if(j-i+1==k){
                if(sum>=x){
                    ans++;
                }
                sum = sum-arr[i];
                i++;
            }
            j++;
        }
        System.out.println(ans); 
    }
}					