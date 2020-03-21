
// 1294 B - Collecting Packages.java Java 11 Accepted
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public*/
public class packagecoll
{
    //Scanner sc=new Scanner(System.in);
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

    static class Pair
    {
        int x,y;
        Pair(int xx, int yy)
        {
            x=xx;
            y=yy;
        }
    }
    // static class sortby_x implements Comparator<Pair>
    // {
    //     public int compare(Pair a, Pair b)
    //     {
    //         return (int)Math.abs(a.x-b.x);
    //     }
        
    // }
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        //Pair p[]=new Pair[t];
        while(t-->0)
        {
            int n=sc.nextInt();
            Pair a[]=new Pair[n];
            for(int i=0;i<n;i++)
            {
                int xi=sc.nextInt();
                int yi=sc.nextInt();
                a[i]=new Pair(xi,yi);
            }
        Arrays.sort(a, (ob1,ob2)->ob1.x==ob2.x?ob1.y-ob2.y:ob1.x-ob2.x);
        int y_max=0, x_max=0;
        boolean flag=true;
        StringBuffer res=new StringBuffer();
        for(int i=0;i<n;i++)
        {
            if(y_max>a[i].y)
            {
                flag=false;
                continue;
            }
            while(x_max<a[i].x)
            {
                x_max++;
                res.append("R");
            }
            while(y_max<a[i].y)
            {
                y_max++;
                res.append("U");
            }
        }
        if(flag==true)
        System.out.println("YES \n"+res.toString());
        else System.out.println("NO");
        }
    }
}
