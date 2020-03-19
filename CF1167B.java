import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class  CF1167B
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
        int a,b;
        public Pair(int a,int b) {
            this.a=a; this.b=b;
        }
    }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
        int a[]={4,8,15,16,23,42};
        HashMap<Integer,Pair> hm=new HashMap<>();
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            hm.put(a[i]*a[j], new Pair(a[i],a[j]));
        }
        // for(Integer i:hm.keySet())
        // {
        //     out.println(i+"-->"+hm.get(i).a+","+hm.get(i).b);
        // }


        ArrayList<Integer> al=new ArrayList<>();

        for(int i=1;i<=6;i+=2)
        {
            out.println("? "+i+" "+(i+1));
            out.flush();
            int res=sc.nextInt(); int k=1;
            for(Integer v:hm.keySet())
            {
                if(v==res)
                {
                    al.add(hm.get(v).a);
                    al.add(hm.get(v).b);
                }
            }
        }
        out.print("! ");
        for(Integer i: al)
        out.print(i+" ");
        // out.println(hm.toString());
        // out.println(hs.toString());
        out.close();
    }
}
