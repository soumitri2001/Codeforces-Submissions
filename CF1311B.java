import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF1311B 
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
            int m=sc.nextInt();
            int a[]=new int[n];
            int p[]=new int[m];
            int b[]=new int[n];
            for(int i=0;i<n;i++)
            {a[i]=sc.nextInt(); b[i]=a[i];}
            for(int i=0;i<m;i++)
            {p[i]=sc.nextInt(); p[i]--;}
            Arrays.sort(p);
            Arrays.sort(b);
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                boolean stat=true;
                for(int i : p)
                {       
                    if(a[i]>a[i+1])
                    {
                        a[i]=a[i]^a[i+1];
                        a[i+1]=a[i+1]^a[i];
                        a[i]=a[i]^a[i+1];
                        stat=false;
                    }
                    if(stat==true) {
                    if(Arrays.equals(a,b))
                    break;
                    }
                }
            }
            // int flag=1;
            // for(int i=0;i<n-1;i++)
            // {
            //     if(a[i]>a[i+1]) {flag=0; break;}
            // }
            if(Arrays.equals(a,b))
            System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
