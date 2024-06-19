package graph;

import java.util.ArrayList;

public class CycleDetection {
    class Edge{
        int src;
        int dest;

        public Edge(int src,int dest)
        {
            this.src=src;   // source that is current vetex
            this.dest=dest;// destination by which current is connected
        }
    }

    public  void createGrapgh(ArrayList[] graph, int v)
    {
        for(int  i=0;i<v;i++)
        {

            // Adding ArrayList to all indexs of given array
            graph[i]= new ArrayList<graph.Edge>();

        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));








    }


    public boolean cycleDetection(ArrayList<Edge> graph[] ,int curr,boolean[] vis ,boolean[] recStack)
    {
       vis[curr]= true;
       recStack[curr]= true;

       for(int i =0;i<graph[curr].size();i++)
       {
         Edge e = graph[curr].get(i);
         if(recStack[e.dest])
         {
             return true;
         }
         else if(!vis[e.dest]){
            if( cycleDetection( graph , e.dest,vis ,recStack)) return true;

         }

       }
       recStack[curr]=false;
       return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>  graph[] = new ArrayList[v];
        boolean[] visited  = new boolean[v];
        boolean[] restack  = new boolean[v];

    CycleDetection cycle = new CycleDetection();
    cycle.createGrapgh(graph,v);
        System.out.println(cycle.cycleDetection(graph,0,visited,restack));



    }
}
