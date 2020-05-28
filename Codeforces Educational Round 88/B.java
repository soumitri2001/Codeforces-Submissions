import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

public class B {

    static class Pair {
        int ff,ss;
        public Pair(int ff,int ss) {
            this.ff=ff; this.ss=ss;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
            char a[][]=new char[n][m];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLine().trim().toCharArray();
            }
            long ctr1=0,ctr2=0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(a[i][j]=='.') ctr2++;
                    if(j<m-1 && a[i][j]=='.' && a[i][j+1]=='.')
                    {
                        ctr1++; ctr2++;
                        j++;
                    }
                }
            }
            long ans=Math.min(x*ctr2,y*ctr1+(ctr2-ctr1*2)*x);
            out.println(ans);
        }
        out.close(); sc.close();
    }
}



