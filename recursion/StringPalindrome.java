import java.util.*;
class stringPalindrome {
    public static void main(String[] args) {
        String s = "MADAwM";
        boolean res = palindrome(s,0);
        System.out.println(res);

    }
    public static boolean palindrome(String s, int i){
        int len = s.length();
        if(i>=len/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(len-i-1)){
            return false;
        }
        return palindrome(s,i+1);
    }
}