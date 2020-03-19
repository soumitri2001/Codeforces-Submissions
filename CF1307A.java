import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF1307A 
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
            int d=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
            int sum=a[0];
            for(int i=1;i<n;i++)
            {
                if(a[i]==0) continue;
                else {
                    while(a[i]>0)
                    {
                        d-=i;
                        if(d<0) break;
                        sum++;
                        a[i]--;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
