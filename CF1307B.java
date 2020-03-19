import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF1307B 
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
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long x=sc.nextLong();
            long max=0;int flag=0;
            int k=0; long a[]=new long[n];
            while(n-->0)
            {
                a[k]=sc.nextLong();
                if(a[k]>max) max=a[k];
                if(a[k]==x) flag=1;
                k++;
            }
            if(flag==1) System.out.println("1");
            else{
            long ctr=0;
            if(max==x)
            ctr=1;
            else if(x%max==0)
            ctr=x/max;
            else 
            {
                if(x<max || x<max*2)
                ctr=2;
                else{
                    long d=x/max;
                    ctr+=d;
                    long s=2*max-1;
                    x=x-s*(long)(Math.ceil(d/2));
                    Arrays.sort(a);
                    if(Arrays.binarySearch(a,x)>=0 || x==0)
                    ++ctr;
                    else ctr+=2;
                }
            }
            System.out.println(ctr);
            }
        }
    }
}
