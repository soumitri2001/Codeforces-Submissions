import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF1311C  
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
            StringBuffer s=new StringBuffer(sc.next());
            //int p[]=new int[m];
            HashMap<Character,Integer> hm=new HashMap();
            for(int i=0;i<26;i++)
            hm.put((char)(i+97),0);
            //System.out.println(hm.toString());
            for(int i=0;i<m;i++)
            {
                int p=sc.nextInt();
                StringBuffer sub=new StringBuffer(s.substring(0,p));
                s=s.append(sub);
            }
            for(int i=0;i<s.length();i++)
            hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            for(Character c : hm.keySet())
            System.out.print(hm.get(c)+" ");
            System.out.println(); 
        }
    }
}
