import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public*/
public class C
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
    static boolean isPowerOfTwo (int x) 
    { 
        return x!=0 && ((x&(x-1)) == 0);          
    } 
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
       int t=sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++) a[i]=sc.nextInt();
           long best=0;int sign=a[0]/Math.abs(a[0]);
           ArrayDeque<Integer> st=new ArrayDeque<>();
            st.push(a[0]);
           for(int i=1;i<n;i++)
           {
               int sgn=a[i]/Math.abs(a[i]);
               if(sgn==sign)
               {
                    if(a[i]>st.peek())
                    {
                        st.pop(); st.push(a[i]);
                    }
               }
               else st.push(a[i]);
               sign=sgn; sgn=0;
           }
           //out.println(st.toString());
           for(Integer i:st) best+=i;
           out.println(best);
       }
        out.close();
    }
}
