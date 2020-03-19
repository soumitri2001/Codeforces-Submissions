import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF1300A  
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
            int a[]=new int[n];
            long sum=0,prod=1; int ctr=0,z=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
                //prod*=a[i];
                if(a[i]==0)
                ++z;
            }
            // System.out.println("sum="+sum);
            // System.out.println("prod="+prod);
            // System.out.println("zeroes="+z);
             
            if(sum==0 && z==0) //no zeroes present
            {
                ctr=1;
            }
            else if(sum!=0 && z>0) // some zeroes are present
            {
                while(z!=0)
                {
                    z--; ctr++;
                    sum+=1;
                }
                if(sum==0) ++ctr;
            }
            else if(sum==0 && z>0) // all are zeroes
            {
                ctr=z;
            }
            // System.out.println("sum="+sum);
            // System.out.println("prod="+prod);
            System.out.println(ctr); 
        }
    }
}
