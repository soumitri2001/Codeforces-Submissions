import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF978C
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
    static int searchof(long prf[], long b)
    {
        int low=0;
        int high=prf.length-1;
        int ind = 0;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (prf[mid] >= b) {
                ind = mid;
                high = mid - 1;
            } else if (prf[mid] < b) {
                low = mid + 1;
            }
        }
                int k= ind;
                return k;
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int n=sc.nextInt();
        int m=sc.nextInt();
        long a[]=new long[n];
        //long b[]=new long[m];
        long prf[]=new long[n+1];
        prf[0]=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
            prf[i+1]=prf[i]+a[i];
        }
        for(int i=0;i<m;i++)
        {
            long b=sc.nextLong();
            // int k=1;
            // while(b>prf[k])
            // {
            //     k++;
            // }
            int k=searchof(prf,b);
            System.out.println(k+" "+(b-prf[k-1]));
        }
    }
}
