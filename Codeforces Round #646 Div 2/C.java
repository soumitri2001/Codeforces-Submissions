import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;


/* Name of the class has to be "Main" only if the class is public*/
public class CF1363C
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
           LinkedList<Integer> adj[]=new LinkedList[n+1];
           for(int i=0;i<=n;i++) adj[i]=new LinkedList<>();
           for(int i=1;i<n;i++)
           {
            int u=sc.nextInt(),v=sc.nextInt();
            adj[u].add(v); adj[v].add(u);
           }
           String ans="";
           int attach=adj[x].size();

           if(attach==1 || n==1) { // leaf node
               ans="Ayush";
            } else {
                if((n&1)==0) ans="Ayush"; 
                else ans="Ashish";
            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}
