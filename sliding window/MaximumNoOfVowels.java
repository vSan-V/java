import java.util.*;
class MaximumNoOfVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k=3;
        int i=0;
        int j=0;
        int max=0;
        List<Character> list = new ArrayList<>();

        while(j<s.length()){
            list.add(s.charAt(j));

            if(j-i+1==k){
                int count=0;
                for(char c:list){
                    if("aeiou".indexOf(c) != -1){
                        count++;
                    }
                }
            max = Math.max(max, count);
            list.remove(0);
            i++;
            }
            j++;
        }
    System.out.println(max);
    }
}