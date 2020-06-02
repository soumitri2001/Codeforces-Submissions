import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;


/* Name of the class has to be "Main" only if the class is public*/
public class CF1363B
{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            String str=sc.next();
            char s[]=str.toCharArray();
            int n=str.length();
            int ans=0;
            if(n<=2) ans=0;
            else if(n==3) {
                if(str.equals("010")||str.equals("101")) 
                ans=1;
                else ans=0;
            }
            else
            {
                int ctr1=0,ctr2=0;
                for(int i=0;i<n;i++)
                {
                    if(s[i]=='0') ++ctr1; else ++ctr2;
                }
                ans=Math.min(ctr1,ctr2);
                int pctr1=0,pctr2=0;
                for(int i=0;i<n;i++)
                {
                    if(s[i]=='0') ++pctr1; else ++pctr2;
                    ans=Math.min(ans,ctr1+pctr2-pctr1);
                    ans=Math.min(ans,ctr2+pctr1-pctr2);
                }
            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}
