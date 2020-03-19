import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF450B 
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
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        long x=sc.nextLong();
        long y=sc.nextLong();
        long n=sc.nextLong();
        //long a[]={x-y,x,y,y-x,x*(-1),y*(-1)};
        long a[]={0,x,y,y-x,x*(-1),y*(-1),x-y};                
        long mod=(long)Math.pow(10,9)+7;
        long ans=0;
        //if(n>6) n=n-((long)(n/6)*6);
        if(n%6==0) {
            ans=a[1];
        }
        //System.out.println(n);
        else{
            if(n>6) n=n%6;
            ans=a[(int)n];
        }
        // long mod=(long)Math.pow(10,9)+7;
        if(ans>=0)
        System.out.println(ans%mod);
        else System.out.println(mod+ans);
    }
}
