import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF447B 
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
        String s=sc.next();
        int l=s.length();
        int k=sc.nextInt();
        HashMap<Character,Integer> hm=new HashMap();
        int a[]=new int[26];
        int max=0;
        for(int i=0;i<26;i++)
        {
            a[i]=sc.nextInt();
            hm.put((char)(i+97),a[i]);
            if(a[i]>max) max=a[i];
        }
        int val=0;
        for(int i=l+1;i<=l+k;i++)
        val+=i*max;
        for(int i=0;i<l;i++)
        {
            val+=hm.get(s.charAt(i))*(i+1);
        }
        System.out.print(val);
    }
}
