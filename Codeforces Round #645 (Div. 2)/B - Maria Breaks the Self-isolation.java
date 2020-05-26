
1358 B - Maria Breaks the Self-isolation.java Java 11 Accepted
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/**
* @author soumitri12
*/

/* Name of the class has to be "Main" only if the class is public*/
public class CF1358
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
    static boolean prime[];
    static final int INT_MAX=1000007;

    static void sieve() {
        prime=new boolean[INT_MAX];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for(int i=2;i<=Math.sqrt(INT_MAX);i++)
        {
            if(prime[i]) {
                for(int j=i*2;j<INT_MAX;j+=i)
                prime[j]=false;
            }
        }
    }
    static class Pair {
        int ff,ss;
        public Pair(int ff,int ss) {
            this.ff=ff; this.ss=ss;
        }
    }
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a); int res=1,ctr=1;
            for(int i=0;i<n;i++) 
            {
                if(a[i]<=ctr) res=ctr+1;
                ++ctr;
            }
            sb.append(res+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}
