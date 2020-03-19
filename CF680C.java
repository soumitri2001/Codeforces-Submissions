import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF680C
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
    
    static boolean prime[];

    static void sieve(){
        prime=new boolean[101]; int n=prime.length;
        for(int i=1;i<=100;i++)
        prime[i]=true;
        prime[1]=false; prime[0]=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(prime[i])
            {
                for(int j=i*2;j<=n;j+=i)
                prime[j]=false;
            }
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
        sieve(); int cnt=0,flag=0;
        int comp[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        int prm[]={53,59,61,67,71,73,79,83,89,97};
        for(int i:comp)
        {
            out.println(i);
            out.flush();
            String res=sc.next();
            if(res.equals("yes"))
            {
                ++cnt; 
                if(i*i<=100) {
                    out.println(i*i); out.flush(); 
                    res=sc.next();
                    if(res.equals("yes")) ++cnt;
                }
            }
            if(cnt>=2)  
            {
                flag=1;break;
            }
        }
        if(flag==0) out.println("prime"); 
        else out.println("composite");
        /*for(int i:prm)
        {
            out.println(i);
            out.flush();
            String res=sc.next();
            if(res.equals("yes")) {
                out.println("prime"); out.close(); return;
            }
        }
        out.println("prime"); */
        
        out.close();
    }
}
