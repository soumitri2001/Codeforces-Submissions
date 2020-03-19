import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class  CF596A
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
    static class Pair{
        int x,y;
        Pair(int xx,int yy)
        {
            x=xx; y=yy;
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        TreeSet<Integer> hx=new TreeSet();
        TreeSet<Integer> hy=new TreeSet();
        int n=sc.nextInt();
        if(n==1) System.out.println("-1");
        else{
            long ar=-1;
            for(int i=0;i<n;i++)
            {
                hx.add(sc.nextInt());
                hy.add(sc.nextInt());
            }
            if(hx.size()==n && hy.size()==n) // all coordinates distinct
            {
                if(n==2) ar=(hx.last()-hx.first())*(hy.last()-hy.first());
                else ar=-1;
            }
            else if(hx.size()!=n && hx.size()==hy.size()) 
            {
                ar=(hx.last()-hx.first())*(hy.last()-hy.first());
            }
            else ar=-1;
            System.out.println(ar);
        }
    }
}
