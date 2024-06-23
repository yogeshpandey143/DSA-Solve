package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstra {

    class Edge{
        int src;
        int dest;
        int w;

        public Edge(int src,int dest,int w)
        {
            this.src=src;   // source that is current vetex
            this.dest=dest;// destination by which current is connected
            this.w = w;
        }
    }

    public  void createGrapgh(ArrayList[] graph, int v)
    {
        for(int  i=0;i<v;i++)
        {

            // Adding ArrayList to all indexs of given array
            graph[i]= new ArrayList<graph.Edge>();

        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }

   public class Pair implements Comparable<Pair>{
     int node;
     int dist;

     public Pair(int node,int dist)
     {
         this.node=node;
         this.dist=dist;
     }

// for comparing the current distance to other distance

       public int compareTo(Pair p)
       {
           return this.dist-p.dist;
       }
   }

public void dijkstra(ArrayList<Edge> graph[] ,int src ,int V)
{
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    boolean[] vis = new boolean[V];
    int[] dist = new int[V];

    // putting initial value as maximum
    for(int i =0;i<V;i++)
    {
        if(i!=src) dist[i]=Integer.MAX_VALUE;
    }


    pq.add(new Pair(0,0));

    //appling bfs
    while(!pq.isEmpty())
    {
        Pair curr = pq.remove();
      if(!vis[curr.node])vis[curr.node]= true;


      for(int i =0;i<graph[curr.node].size();i++)
      {

          Edge e = graph[curr.node].get(i);
          int u = e.src;
          int v = e.dest;


          // compare the source + weight  by actual distance between the source and destination
          if(dist[u]+ e.w<dist[v]) {
              // relaxation
              dist[v] = dist[u] + e.w;
              pq.add(new Pair(v, dist[v]));
          }

      }
    }

    for(int i =0;i<V;i++)
    {
        System.out.print(dist[i]+" ");
    }

    }


    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean[] visited = new boolean[v];

        Dijkstra d = new Dijkstra();
        d.createGrapgh(graph,v);
        d.dijkstra(graph,0,v);


    }
    }







