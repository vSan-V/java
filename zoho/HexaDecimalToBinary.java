
import java.util.*;
class HexaDecimalToBinary{
    public static void main(String[] args) {
        String a = "12A";
        String binary="";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            int val;
            if(ch>='A' && ch<='F'){
                 val = map.get(ch);
                
            }
            else{
                val = ch-'0';
            }
            int temp=val;
            int add=0;
            int place=1;
        
            while(temp>0){
	        int t = temp%2;
	        add = add+t*place;
	        place = place*10;
	        temp=temp/2;
	        
	    }
	    String binPart = Integer.toString(add);
	    while(binPart.length()<4){
	        binPart = "0"+binPart;
	    }
	    binary = binary+binPart;
        }
        System.out.println(binary);
        System.out.println(map);
    }
}