import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF313B
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
    static class Pair {
        int l,r;
        public Pair(int ll, int rr) {
            l=ll; r=rr;
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        String s=sc.next();
        char c[]=s.toCharArray();
        /*int a[]=new int[c.length-1];
        int prf[]=new int[a.length];
        for(int i=0;i<a.length-1;i++)
        {
            if(c[i]==c[i+1])
            a[i]=1;
            if(i==0)
            prf[i]=a[i];
            else
            prf[i+1]=prf[i]+a[i];
        }*/
        int a[]=new int[s.length()];
        int k=0;
        for(int i=1;i<s.length();i++)
        {
            if(c[i]==c[i-1])
            k++;
            a[i]=k;
        }

        int n=sc.nextInt();
        //Pair a[]=new Pair[n];
        for(int i=0;i<n;i++)
        {
            //a[i]=new Pair(sc.nextInt(),sc.nextInt());
            int x=sc.nextInt();//x=x-1;
            int y=sc.nextInt();y=y-1;
            int ctr=a[y]-a[x-1];
            System.out.println(ctr);
        }
        
    }
}
