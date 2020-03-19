import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF842B 
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
        int R=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        int ctr=0;
        while(n-->0)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            long p1=x*x+y*y-R*R;
            long p2=x*x+y*y-(R-d)*(R-d);
            if(p1*p2<=0)
            {
                double dd=Math.sqrt(x*x+y*y);
                if(dd+r<=R && dd-r>=R-d)
                {
                    ++ctr; 
                }
            }
        }
        System.out.print(ctr);
    }
}
