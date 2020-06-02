import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;


/* Name of the class has to be "Main" only if the class is public*/
public class CF1363A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt(),x=sc.nextInt();
            int a[]=new int[n];
            int o=0,e=0;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if((a[i]&1)==0) ++e; else ++o;
            }
            String ans="";
            if(o==0) ans="No";
            else if(x==n && o%2==0) ans="No"; 
            else{
                if(o+e==x) {
                    if(o%2==0) ans="No";
                    else ans="Yes";
                } else {
                    if(o>0) ans="Yes"; else ans="No";
                    if(e==0 && x%2==0) ans="No";
                }
            }
            sb.append(ans+"\n"); 
        }
        out.println(sb.toString());
        out.close();
    }
}
