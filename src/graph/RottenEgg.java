package graph;

import java.util.Queue;

public class RottenEgg {

    public class Pair{
        int row;
        int col;
        int time ;

        public Pair(int row ,int col ,int time)
        {
            this.row=row;
            this.col=col;
            this.time =time;
        }
    }
    //Function to find minimum time required to rot all oranges.
    public int orangesRotting(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;

        // we are using bfs because we want to travlsimultanously to every neighbour
        Queue<Pair> q = new ArrayDeque<>();

        // to count fresh oranges
        int ctnFresh=0;
        int[][] vis = new int[n][m];


        // iterating on matring to get the rotten orange
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]==2)
                {
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==1) ctnFresh++;

            }
        }

        int tm =0;

        // since we can only move to the left right down and top
        // we have to store the indexed by which thw original row and colunms will increment or decrement
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        //  using count to get the no of fresh orange converted to the rotten orange
        int count=0;

        while(!q.isEmpty())
        {
            Pair p = q.remove();
            int r = p.row;
            int c = p.col;
            int t = p.time;

            tm = Math.max(tm,t);

            for(int i =0;i<4;i++)
            {

                int dr = r+drow[i];
                int dc = c+dcol[i];

                if(dr>=0 && dr<n && dc>=0 && dc<m && grid[dr][dc]==1 && vis[dr][dc]==0 )
                {
                    q.add(new Pair(dr,dc,t+1));
                    vis[dr][dc]=2;
                    count++;
                }

            }

        }


        if(count!=ctnFresh)return -1;

        return tm;

    }

}
