class TwistedPrimeNumber{
    public static void main(String[] args){
        int num=97;
        if(num<=1) {
            System.out.println("not a prime"); return;
        }
        int temp=num;
        int rev = 0;
        while(temp>0){
            int s = temp%10;
            rev  = rev*10+s;
            temp=temp/10;
        }
        System.out.println(rev);
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%2==0){
                System.out.println("not a prime");
                return;
            }
        }
        for(int i=2;i<Math.sqrt(rev);i++){
            if(rev%2==0){
                System.out.println("not a prime");
                return;
            }
        }
        System.out.println("prime");
    }
}