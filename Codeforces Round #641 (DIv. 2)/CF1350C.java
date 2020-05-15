import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/**
* @author soumitri12
*/

/* Name of the class has to be "Main" only if the class is public*/
public class CF1350C
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
        if(y>x) { x=x^y;y=y^x;x=x^y; }
        if(y==0) return x;
        else return gcd(y,x%y);
    } 
    static long mod_pow(long a, long b, long mod)
    {
        a%=mod;
        if(b==0) return 1%mod;
        if((b&1)==1) return a*(mod_pow(a,b-1,mod))%mod;
        else 
        {
            long u=mod_pow(a,b>>1,mod);
            return (u*u)%mod;
        }
    }
    static long _pow(long a, long b)
    {
        if(b==0) return 1;
        if((b&1)==1) return a*_pow(a,b-1);
        else 
        {
            long u=_pow(a,b>>1);
            return u*u;
        }
    }
    static int modInv(int a, int m)
    {
        if(gcd(a,m)!=1) return -999;
        else return (a%m+m)%m;
    }
    static boolean isPowerOfTwo(int x) 
    { 
        return x!=0 && ((x&(x-1)) == 0);          
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
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int g[]=new int[n-1];
        int suf[]=new int[n]; suf[n-1]=a[n-1];
        
        for(int i=n-2;i>=0;i--) 
        {
           suf[i]=gcd(suf[i+1],a[i]);
        }  
        // out.println(Arrays.toString(suf));
        
        for(int i=0;i<n-1;i++) 
        {
            g[i]=(a[i]*suf[i+1])/gcd(a[i],suf[i+1]);
        } 
        //out.println(Arrays.toString(g));
        
        int ans=g[0];
        for(int i=1;i<n-1;i++) 
        {
           // g[i]=gcd(g[i],g[i-1]);
           ans=gcd(ans,g[i]);
        } 
        //out.println(Arrays.toString(g));
        
        out.println(ans);
        out.close();
    }
}
