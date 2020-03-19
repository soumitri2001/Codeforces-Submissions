import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF977C  
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
        Long arr[]=new Long[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        arr[i]=new Long(sc.nextLong());
        Arrays.sort(arr);
        // if(k==0) System.out.print(a[0]<=1?"-1":--a[0]);
        // else if(k==1)
        // {
        //     System.out.print(a[k-1]==a[k]?"-1":a[k-1]);
        // }else if(k==n)
        // {
        //     System.out.print(a[k-1]);
        // }
        // else{
        //     if(a[k-1]==a[k] || a[k-1]==a[k-2])
        //     System.out.print("-1");
        //     else System.out.print(a[k-1]);
        // }
        long a[]=new long[n];int j=0;
        for(Long i : arr)
        a[j++]=Long.valueOf(i);

        long ans=0;int ctr=0;
        if(k==0) {
            ans=a[0]<=1?-1:a[0]-1;
            System.out.print(ans);
        }
        else{
            ctr=0;
            ans=a[k-1];
            for(int i=0;i<n;i++)
            {
                if(a[i]<=ans) ++ctr;
            }
            if(ans<1 || ctr!=k)
            System.out.print("-1");
            else System.out.print(ans);
        }
    }
}
