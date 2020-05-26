
1358 C - Celex Update.java Java 11 Accepted
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
    static long _gcd(long x, long y)
    {
        if(x<y) {x=x^y;y=y^x;x=x^y;}
        if(y==0) return x;
        else return _gcd(y,x%y);
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
    static long nCr(long n, long r)
    {
        if(r>n-r) r=n-r;
        if(r==0) return 1;
        else if(r==1) return n;
        else 
        {
            long comb=1,rem=1;
            while(r>0)
            {
                comb*=n;
                rem*=r;
                long g=_gcd(comb, rem);
                comb/=g; rem/=g;
                n--; r--;
            }
            return comb;
        }
    }
    static long findRoutes(int x,int y)
    {
        long dp[][]=new long[x+1][y+1];
        for(int i=1;i<=x;i++) dp[i][0]=1;
        for(int i=1;i<=y;i++) dp[0][i]=1;
        for(int i=1;i<=x;i++) {
            for(int j=1;j<=y;j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[x][y];
    }
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            long x1=sc.nextLong(),y1=sc.nextLong();
            long x2=sc.nextLong(),y2=sc.nextLong();
            long ans=1L;
            long del_x=Math.abs(x1-x2),del_y=Math.abs(y1-y2);
            if(del_x*del_y==0) ans=1L;
            // else if(del_x*del_y==1) ans=2L;
            else
            {
                long tot=del_x+del_y;
                //ans=nCr(tot, del_x);   
                //x2-=x1;y2-=y1; x1=y1=0;
                //ans=findRoutes((int)x2,(int)y2);
                ans=1+(del_x*del_y);
            }

            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}

1358 C - Celex Update.java Java 11 Wrong answer on pretest 2
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
    static long _gcd(long x, long y)
    {
        if(x<y) {x=x^y;y=y^x;x=x^y;}
        if(y==0) return x;
        else return _gcd(y,x%y);
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
    static long nCr(long n, long r)
    {
        if(r>n-r) r=n-r;
        if(r==0) return 1;
        else if(r==1) return n;
        else 
        {
            long comb=1,rem=1;
            while(r>0)
            {
                comb*=n;
                rem*=r;
                long g=_gcd(comb, rem);
                comb/=g; rem/=g;
                n--; r--;
            }
            return comb;
        }
    }
    static long findRoutes(int x,int y)
    {
        long dp[][]=new long[x+1][y+1];
        for(int i=1;i<=x;i++) dp[i][0]=1;
        for(int i=1;i<=y;i++) dp[0][i]=1;
        for(int i=1;i<=x;i++) {
            for(int j=1;j<=y;j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[x][y];
    }
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            long x1=sc.nextLong(),y1=sc.nextLong();
            long x2=sc.nextLong(),y2=sc.nextLong();
            long ans=1L;
            long del_x=Math.abs(x1-x2),del_y=Math.abs(y1-y2);
            if(del_x*del_y==0) ans=1L;
            // else if(del_x*del_y==1) ans=2L;
            else
            {
                long tot=del_x+del_y;
                //ans=nCr(tot, del_x);   
                x2-=x1;y2-=y1; x1=y1=0;
                ans=findRoutes((int)x2,(int)y2);

            }

            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}

1358 C - Celex Update.java Java 11 Wrong answer on pretest 2
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
    static long _gcd(long x, long y)
    {
        if(x<y) {x=x^y;y=y^x;x=x^y;}
        if(y==0) return x;
        else return _gcd(y,x%y);
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
    static long nCr(long n, long r)
    {
        if(r>n-r) r=n-r;
        if(r==0) return 1;
        else if(r==1) return n;
        else 
        {
            long comb=1,rem=1;
            while(r>0)
            {
                comb*=n;
                rem*=r;
                long g=_gcd(comb, rem);
                comb/=g; rem/=g;
                n--; r--;
            }
            return comb;
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
            long x1=sc.nextLong(),y1=sc.nextLong();
            long x2=sc.nextLong(),y2=sc.nextLong();
            long ans=1L;
            long del_x=Math.abs(x1-x2),del_y=Math.abs(y1-y2);
            if(del_x*del_y==0) ans=1L;
            // else if(del_x*del_y==1) ans=2L;
            else
            {
                long tot=del_x+del_y;
                // ans=tot*(tot-1)/2;
                ans=nCr(tot, Math.min(del_x,del_y));    

            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}

1358 C - Celex Update.java Java 11 Wrong answer on pretest 2
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
    static long _gcd(long x, long y)
    {
        if(x<y) {x=x^y;y=y^x;x=x^y;}
        if(y==0) return x;
        else return _gcd(y,x%y);
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
    static long nCr(long n, long r)
    {
        if(r>n-r) r=n-r;
        if(r==0) return 1;
        else if(r==1) return n;
        else 
        {
            long comb=1,rem=1;
            while(r>0)
            {
                comb*=n;
                rem*=r;
                long g=_gcd(comb, rem);
                comb/=g; rem/=g;
                n--; r--;
            }
            return comb;
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
            long x1=sc.nextLong(),y1=sc.nextLong();
            long x2=sc.nextLong(),y2=sc.nextLong();
            long ans=1L;
            long del_x=Math.abs(x1-x2),del_y=Math.abs(y1-y2);
            if(del_x*del_y==0) ans=1L;
            // else if(del_x*del_y==1) ans=2L;
            else
            {
                long tot=del_x+del_y;
                // ans=tot*(tot-1)/2;
                ans=nCr(tot, (tot>>1));    

            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}

1358 C - Celex Update.java Java 11 Wrong answer on pretest 2
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
    static long _gcd(long x, long y)
    {
        if(y==0) return x;
        else return _gcd(y,x%y);
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
    static long nCr(long n, long r)
    {
        if(r>n-r) r=n-r;
        if(r==0) return 1;
        else if(r==1) return n;
        else 
        {
            long comb=1,rem=1;
            while(r>0)
            {
                comb*=n;
                rem*=r;
                long g=_gcd(comb, rem);
                comb/=g; rem/=g;
                n--; r--;
            }
            return comb;
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
            long x1=sc.nextLong(),y1=sc.nextLong();
            long x2=sc.nextLong(),y2=sc.nextLong();
            long ans=1L;
            long del_x=Math.abs(x1-x2),del_y=Math.abs(y1-y2);
            if(del_x*del_y==0) ans=1L;
            else if(del_x*del_y==1) ans=2L;
            else
            {
                long tot=del_x+del_y;
                // ans=tot*(tot-1)/2;
                ans=nCr(tot, (tot>>1));    

            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}

1358 C - Celex Update.java Java 11 Wrong answer on pretest 2
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
            long x1=sc.nextLong(),y1=sc.nextLong();
            long x2=sc.nextLong(),y2=sc.nextLong();
            long ans=1L;
            long del_x=Math.abs(x1-x2),del_y=Math.abs(y1-y2);
            if(del_x*del_y==0) ans=1L;
            else if(del_x*del_y==1) ans=2L;
            else
            {
                long tot=del_x+del_y;
                ans=tot*(tot-1)/2;    
            }
            sb.append(ans+"\n");
        }
        out.println(sb.toString());
        out.close();
    }
}
