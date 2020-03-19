import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF977B 
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
        String s=sc.next();
        char c[]=s.toCharArray();
        HashMap<String,Integer> hm=new HashMap();
        String res=""; int f=1;
        for(int i=0;i<n-1;i++)
        {
            String x=""+c[i]+c[i+1];
            if(hm.containsKey(x))
            hm.put(x,hm.get(x)+1);
            else hm.put(x,1);
            if(hm.get(x)>=f) {
                f=hm.get(x); res=x;
            }
        }
        System.out.print(res);
    }
}
