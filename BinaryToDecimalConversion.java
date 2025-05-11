import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) {
        int binary = 11;
        
        int n=0;
        int decimal=0;
        int temp=0;
        
        while(binary>0){
            temp = binary%10;
            //Math.pow() always returns a double value, So we use type conversion
            decimal = decimal+(int)(temp*Math.pow(2,n));
            binary = binary/10;
            n++;
        }
        System.out.println(decimal);
    }
}
