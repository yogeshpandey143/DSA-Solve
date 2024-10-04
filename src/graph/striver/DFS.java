package graph.striver;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(1);
        int V = 3;
     boolean vis[] = new boolean[V];
     int curr =0;
        dfs(adj ,vis, curr);

    }


    public static void dfs(List<List<Integer>>adj,boolean[] vis,int curr)
    {
        System.out.println(curr);
        vis[curr]=true;
        List<Integer> list= adj.get(curr);

        for(int i =0;i<adj.get(curr).size();i++)
        {
             int dest = list.get(i);
             if(vis[dest]==false)
             {
                 dfs(adj,vis,dest);
             }
        }
    }
}
