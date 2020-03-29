import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF727C
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
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
        int n=sc.nextInt();
        int k[]=new int[n+1]; long sum=0;
        out.println("? 1 2"); out.flush(); int x=sc.nextInt();
        out.println("? 2 3"); out.flush(); int y=sc.nextInt();
        out.println("? 1 3"); out.flush(); int z=sc.nextInt();
        k[1]=(x-y+z)/2; k[2]=(x+y-z)/2; k[3]=(y+z-x)/2;
        for(int i=4;i<=n;i++)
        {
            out.println("? 1 "+i); out.flush();
            int p=sc.nextInt();
            k[i]=p-k[1];
        }
        out.print("!");
        for(int i=1;i<=n;i++)
        out.print(" "+k[i]);
        out.close();
    }
}
