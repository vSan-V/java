class MaximumSumSubArrayK {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k=3;
        int i=0;
        int j=0;
        int max = -1;
        int sum=0;

        while(j<arr.length){
            sum = sum+arr[j];
            if(j-i+1==k){
                max = Math.max(max, sum);
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        System.out.println(max);    
    }
}