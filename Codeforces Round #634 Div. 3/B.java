import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public*/
public class B
{
    static class FastReader {
        
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    static class Node {
        
        long pp;
        long a, b;
        
        Node(long x, long y) {
            a = x;
            b = y;
            pp = a * b;
        }
    }
    static class Comp implements Comparator<Node> {
        
        public int compare(Node o1, Node o2) {
            if (o1.pp > o2.pp) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    static int gcd(int x, int y)
    {
        if(y==0) return x;
        else return gcd(y,x%y);
    } 
    static boolean isprime(int x) 
    {
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            String res="", sub="";
            int d=a-b; 
            if(d==0)
            {
                if(a==1)
                {
                    while(res.length()!=n) res+='a';
                }
                else 
                {
                    for(int i=0;i<a;i++) sub+=(char)(97+i);
                    int k=0;
                    while(res.length()!=n) 
                    {
                        res+=sub.charAt(k++); 
                        if(k==sub.length()) k=0;
                    }
                }
                out.println(res);
                continue;
            }

            String ans="";
            for(int i=0;i<b;i++) res+=(char)(i+97);
            for(int i=0;i<d;i++) res+='a';
            if(res.length()==n) out.println(res);
            else 
            {
                ans=res; int k=1;
                while(ans.length()!=n)
                {
                    ans+=res.charAt(k++);
                    if(k==res.length()) k=1;
                }
                out.println(ans);
            }
        }


        out.close();
    }
}
