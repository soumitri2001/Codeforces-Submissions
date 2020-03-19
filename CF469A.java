import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF469A
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
        int n=sc.nextInt();
        int p=sc.nextInt();
        int x[]=new int[p];
        for(int i=0;i<p;i++)
        x[i]=sc.nextInt();
        int q=sc.nextInt();
        int y[]=new int[q];
        for(int i=0;i<q;i++)
        y[i]=sc.nextInt();
        if(p==0 || q==0)
        {
            if(p+q==n)
            System.out.println("I become the guy.");
            else            
            System.out.println("Oh, my keyboard!");
            return;
        }
        TreeSet<Integer> ts=new TreeSet();
        for(int i=0;i<p;i++)
            ts.add(x[i]);
        for(int i=0;i<q;i++)
            ts.add(y[i]);
        int l=ts.size();
        //System.out.print(ts +" "+ l);
        if(ts.last()>=n && l==n)
        System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
