import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public*/
public class D
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
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
        int t=sc.nextInt();
        while(t-->0)
        {
            int mat[][]=new int[9][9];
            for(int i=0;i<9;i++)
            {
                String num=sc.next();
                for(int j=0;j<9;j++)
                {
                    mat[i][j]=num.charAt(j)-'0';
                }
            }
            out.println("\n");
            int k=0;
            for(int i=0;i<9;)
            {
                for(int j=k;j<9;j+=3)
                {
                    mat[i][j]++;
                    if(mat[i][j]==10) mat[i][j]=1;
                    ++i;
                }
                ++k;
            }
            for(int i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                out.print(mat[i][j]);
                out.print("\n");
            }
        }

        out.close();
    }
}
