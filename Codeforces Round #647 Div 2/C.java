import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

public class CF1362C
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
            long n=sc.nextLong();
            long ans=1;
            if(isPowerOfTwo(n)) ans=_pow(2,log2(n)+1)-1;
            else {
                ans=0;
                while(n>0)
                {
                    ans+=n; n>>=1;
                }
            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}
