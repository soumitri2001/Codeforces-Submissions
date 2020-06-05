
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

public class CF1362A
{
    
    static boolean isPowerOfTwo(long x) 
    { 
        return x!=0 && ((x&(x-1)) == 0);          
    } 
    static int log2(long x) 
    { 
        int res = 0; 
        while ((x>>1)!=0) 
        {
            ++res; x=x>>1;
        }
        return res; 
    } 
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {   
            long a=sc.nextLong(),b=sc.nextLong();
            long ans=0;
            if(a==b) ans=0;
            if(a<b) {a=a^b;b=b^a;a=a^b;} // assert a > b
            long rem=a%b;
            if(rem!=0) ans=-1;
            else
            {
                long quo=a/b;
                if(!isPowerOfTwo(quo)) ans=-1;
                else
                {
                    // b divides a and the quotient is a power of 2
                    int power=log2(quo); // power of 2
                    if(power%3==0) ans=power/3;
                    else ans=(long)Math.ceil(1.0*power/3.0);
                }
            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}
