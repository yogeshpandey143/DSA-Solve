package graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch
{

    public static class Edge{
        int src;
        int dest;

        public Edge(int src,int dest)
        {
            this.src=src;
            this.dest=dest;
        }
    }

    // graph storing using Adjecency List
    public  void createGrapgh(ArrayList[] graph, int v)
    {
        for(int  i=0;i<v;i++)
        {
            graph[i]= new ArrayList<graph.Edge>();

        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));


        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));


        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,1));


    }


    public  void bfs(ArrayList<Edge> graph[],int v)   // bfs or level order traversal
    {

        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[v];

    q.add(0);

    while(!q.isEmpty())
    {
        int curr =q.remove();
        if(!visited[curr])
        {
            System.out.println(curr);
            visited[curr] = true;
            for(int i =0;i<graph[curr].size();i++)
            {
         Edge e = graph[curr].get(i);
         q.add(e.dest);
            }
        }
    }

    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>  graph[] = new ArrayList[v];
        BreadthFirstSearch obj = new BreadthFirstSearch();
        obj.createGrapgh(graph,v);
        obj.bfs(graph,v);

    }





}




