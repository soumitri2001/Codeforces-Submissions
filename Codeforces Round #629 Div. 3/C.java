import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public*/
public class C
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
    
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            String s=sc.next();
            char a[]=s.toCharArray();
            String s1="1", s2="1"; int pos=n;
            for(int i=1;i<n;i++) 
            {
                if(s1.charAt(i-1)==s2.charAt(i-1))
                {
                    switch(a[i])
                    {
                        case '1': s1+='1'; s2+='0'; 
                        break;
                        case '2': s1+='1';s2+='1';
                        break;
                        case '0': s1+='0'; s2+='0';
                        break;
                    }
                }
                else{
                    pos=i;break;
                } 
            }
            out.print(s1);
            for(int i=pos;i<n;i++) out.print("0");
            out.print("\n"+s2);
            for(int i=pos;i<n;i++) out.print(a[i]);
            out.print("\n");
            
        }


        out.close();
    }
}
