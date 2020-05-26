
1358 D - The Best Vacation.java Java 11 Accepted
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
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int n=sc.nextInt();;long x=sc.nextLong();
        long a[]=new long[2*n+1],prfsum[]=new long[2*n+1],prf[]=new long[2*n+1];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextLong(); a[n+i]=a[i];
        } 
        prfsum[1]=a[1]*(a[1]+1)/2 ; prf[1]=a[1] ;
        for(int i=2;i<=2*n;i++) {
            prfsum[i]=prfsum[i-1]+(a[i]*(a[i]+1)/2);
            prf[i]=prf[i-1]+a[i];
        }
        long fin_ans=0;
        for(int i=2*n;i>=n+1;i--)
        {
            int l=1,u=i,mid,idx=i;
            while(l<=u)
            {
                mid=(l+u)/2;
                long days=prf[i]-prf[mid];
                if(days>x) l=mid+1;
                else{
                    idx=mid;
                    u=mid-1;
                }
            }
            long diff=prf[i]-prf[idx-1]-x;
            long ans=prfsum[i]-prfsum[idx-1];
            ans-=diff*(1+diff)/2;
            fin_ans=Math.max(fin_ans,ans);
        }
        out.println(fin_ans);
        out.close();
    }
}

1358 D - The Best Vacation.java Java 11 Runtime error on test 12
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
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int n=sc.nextInt(),x=sc.nextInt();
        long a[]=new long[2*n+1],prfsum[]=new long[2*n+1],prf[]=new long[2*n+1];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextLong(); a[n+i]=a[i];
        } 
        prfsum[1]=a[1]*(a[1]+1)/2 ; prf[1]=a[1] ;
        for(int i=2;i<=2*n;i++) {
            prfsum[i]=prfsum[i-1]+(a[i]*(a[i]+1)/2);
            prf[i]=prf[i-1]+a[i];
        }
        long fin_ans=0;
        for(int i=2*n;i>=n+1;i--)
        {
            int l=1,u=i,mid,idx=i;
            while(l<=u)
            {
                mid=(l+u)/2;
                long days=prf[i]-prf[mid];
                if(days>x) l=mid+1;
                else{
                    idx=mid;
                    u=mid-1;
                }
            }
            long diff=prf[i]-prf[idx-1]-x;
            long ans=prfsum[i]-prfsum[idx-1];
            ans-=diff*(1+diff)/2;
            fin_ans=Math.max(fin_ans,ans);
        }
        out.println(fin_ans);
        out.close();
    }
}

1358 D - The Best Vacation.java Java 11 Wrong answer on test 3
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
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int n=sc.nextInt(),x=sc.nextInt();
        long a[]=new long[2*n+1],prfsum[]=new long[2*n+1],prf[]=new long[2*n+1];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextLong(); a[n+i]=a[i];
        } 
        prfsum[1]=a[1]*(a[1]+1)/2 ; prf[1]=a[1] ;
        for(int i=2;i<=2*n;i++) {
            prfsum[i]=prfsum[i-1]+(a[i]*(a[i]+1)/2);
            prf[i]=prf[i-1]+a[i];
        }
        long fin_ans=0;
        for(int i=2*n;i>=n+1;i--)
        {
            int l=1,u=i,mid,idx=i;
            while(l<=u)
            {
                mid=(l+u)/2;
                long days=prf[u]-prf[mid];
                if(days>x) l=mid+1;
                else{
                    idx=mid;
                    u=mid-1;
                }
            }
            long diff=prf[i]-prf[idx-1]-x;
            long ans=prfsum[i]-prfsum[idx-1];
            ans-=diff*(1+diff)/2;
            fin_ans=Math.max(fin_ans,ans);
        }
        out.println(fin_ans);
        out.close();
    }
}

1358 D - The Best Vacation.java Java 11 Wrong answer on test 1
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
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int n=sc.nextInt(),x=sc.nextInt();
        long a[]=new long[2*n+1],prfsum[]=new long[2*n+1],prf[]=new long[2*n+1];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextLong(); a[n+i]=a[i];
        } 
        prfsum[1]=a[1]*(a[1]+1)/2 ; prf[1]=a[1] ;
        for(int i=2;i<=2*n;i++) {
            prfsum[i]=prfsum[i-1]+(a[i]*(a[i]+1)/2);
            prf[i]=prf[i-1]+a[i];
        }
        long fin_ans=0;
        for(int i=2*n;i>=n+1;i--)
        {
            int l=1,u=i,mid,max=i,ans=0;
            while(l<=u)
            {
                mid=(l+u)/2;
                long days=prf[u]-prf[mid];
                if(days>x) l=mid+1;
                else{
                    ans=mid;
                    long diff=x-days;
                    long res=prfsum[i-1]-prfsum[ans-1]-(diff*(++diff)/2);
                    fin_ans=Math.max(fin_ans,res);
                    u=mid-1;
                }
            }
        }
        out.println(fin_ans);
        out.close();
    }
}

1358 D - The Best Vacation.java Java 11 Wrong answer on test 1
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
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        StringBuffer sb=new StringBuffer();
        //your code starts here
        int n=sc.nextInt(),x=sc.nextInt();
        long a[]=new long[2*n+1],prfsum[]=new long[2*n+1],prf[]=new long[2*n+1];
        for(int i=1;i<=n;i++) {
            a[i]=sc.nextLong(); a[n+i]=a[i];
        } 
        prfsum[1]=a[1]*(a[1]+1)/2 ; prf[1]=a[1] ;
        for(int i=2;i<=2*n;i++) {
            prfsum[i]=prfsum[i-1]+(a[i]*(a[i]+1)/2);
            prf[i]=prf[i-1]+a[i];
        }
        long fin_ans=0;
        for(int i=1;i<=2*n;i++)
        {
            int l=1,u=i,mid,max=i,ans=0;
            while(l<=u)
            {
                mid=(l+u)/2;
                long days=prf[u]-prf[mid];
                if(days>x) l=mid+1;
                else{
                    ans=mid;
                    long diff=x-days;
                    long res=prfsum[i-1]-prfsum[ans-1]-(diff*(++diff)/2);
                    fin_ans=Math.max(fin_ans,res);
                    u=mid-1;
                }
            }
        }
        out.println(fin_ans);
        out.close();
    }
}
