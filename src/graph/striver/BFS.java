package graph.striver;

import java.util.*;

public class BFS {
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
        bfs(adj ,V);

    }


    public static void bfs(List<List<Integer>> adj, int V)
    {
      Queue<Integer> q = new ArrayDeque<>();
      boolean vis[] = new boolean[V];
      q.add(0);
      vis[0]=true;
        System.out.println(0);

      while(!q.isEmpty())
      {
          int curr = q.remove();
          List<Integer> list = adj.get(curr);

          for(int el:list)
          {
              if(!vis[el]) {
                  vis[el] = true;
                  q.add(el);
                  System.out.println(el);
              }
          }
      }

    }

}
