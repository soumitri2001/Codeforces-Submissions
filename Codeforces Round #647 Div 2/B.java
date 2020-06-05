import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

public class CF1362B
{
 
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {   
            int n=sc.nextInt();
            Integer a[]=new Integer[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Integer b[]=a.clone();
            Arrays.sort(a); Arrays.sort(b); // a and b are identical
            Integer ans=-1;
            for(Integer i=1;i<=1024;i++)
            {
                a=b.clone();
                for(int j=0;j<n;j++) a[j]^=i;
                Arrays.sort(a);
                if(Arrays.equals(a,b)) {
                    ans=i;
                    break;
                } else a=b.clone();
            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}
