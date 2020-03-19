import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;

/* Name of the class has to be "Main" only if the class is public*/
public class CF602C
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
        PrintWriter out=new PrintWriter(System.out);
        //your code starts here
        int n=sc.nextInt();
        boolean adj[][]=new boolean[n][n];
        int m=sc.nextInt();
        for(int i=0;i<m;i++) 
        {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            // adding edges of undirected graph
            adj[a][b]=true; adj[b][a]=true;
        }
        if(m==0 || m==(n*(n-1)/2)) {
            out.println(-1); out.close(); return;
        }
        int[] dist=new int[n]; Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0]=0;
        Queue<Integer> q=new LinkedList();
        q.add(0); 
        while(!q.isEmpty())
        {
            int s=q.poll();
            for(int i=0;i<n;i++)
            {
                if(!adj[0][n-1] && adj[s][i])
                {
                    if(dist[i]==Integer.MAX_VALUE) {
                    dist[i]=dist[s]+1;
                    q.add(i);
                    }
                }
                else if(!adj[s][i] && adj[0][n-1])
                {
                    if(dist[i]==Integer.MAX_VALUE)
                    {
                        dist[i]=dist[s]+1;
                        q.add(i);
                    }
                }
            }
        }
        //for(int i:dist) out.print(i+" ");
         if(dist[n-1]==Integer.MAX_VALUE) out.println(-1);
         else out.println(Math.max(1,dist[n-1]));
        out.close();
    }
}
