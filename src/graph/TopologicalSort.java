package graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {

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

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));


    }


    public void topological(ArrayList<Edge> graph[],int curr ,boolean[] vis ,Stack<Integer> stack)
    {
        vis[curr]= true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e = graph[curr].get(i);

            if(!vis[e.dest])
            {
                topological(graph,e.dest , vis ,stack);
            }
        }

       stack.push(curr);
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>  graph[] = new ArrayList[v];
        boolean[] visited  = new boolean[v];
         Stack<Integer> st = new Stack<>();

        TopologicalSort topo = new TopologicalSort();

        topo.createGrapgh(graph,v);

      for(int i =0;i<v;i++)
      {

          if(!visited[i])
         topo.topological(graph,i,visited,st);
      }

      while(!st.isEmpty())
      {
          System.out.println(st.pop());
      }

    }

}
