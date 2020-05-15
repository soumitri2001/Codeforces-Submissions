import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF1350A
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
    static long lcm(int a, int b)
    {
        return (long) (a*b/gcd(a,b));
    }
    static int modInv(int a, int m)
    {
        if(gcd(a,m)!=1) return -999;
        else return (a%m+m)%m;
    }
    static boolean isPowerOfTwo (int x) 
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
    static int f(int n)
    {
        int f=1;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) {
                f=i; break;
            }
        }
        if(f==1) f=n;
        return f;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt(),k=sc.nextInt();
            long ans=0;
            if(isprime(n)) 
            ans=2*n+2*(k-1);
            else if((n&1)==0) 
            ans=n+2*k;
            else if((n&1)==1)
            {
                n+=f(n); --k;
                ans=n+2*k;
            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}

