package graph;

import java.util.*;

public class AllPath {

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

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));


        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));


        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,5));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,3));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,6));
        graph[5].add(new Edge(5,4));

        graph[6].add(new Edge(6,5));



    }


    public void pathdfs(ArrayList<Edge> graph[],int curr ,boolean[] visited,String path,int target)
    {

        // if we found the target then print the path
        if(curr==target)
        {
            System.out.println(path);
            return;
        }
     // to iterate  the every eadge of current vertex
      for(int  i=0;i<graph[curr].size();i++)
      {

          //particular edge
        Edge e = graph[curr].get(i);
        if(!visited[curr])
        {

            visited[curr]=true;
            pathdfs(graph,e.dest,visited,path+e.dest,target);

            // backtrack visited = false because we need the vertex for another path
            visited[curr]=false;
        }
      }

    }


    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge>  graph[] = new ArrayList[v];

        boolean[] visited  = new boolean[v];

        AllPath path = new AllPath();
        path.createGrapgh(graph,v);
        path.pathdfs(graph,0,visited,"0",5);


    }




}
