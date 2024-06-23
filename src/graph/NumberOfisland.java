package graph;

public class NumberOfisland {

    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;


        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if( grid[i][j]=='1')
                {
                    count++;
                    dfs(grid,i,j);
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int row,int col)
    {
        int n =grid.length;
        int m = grid[0].length;

        if( row<0 || row>=n || col<0 || col>=m  || grid[row][col]=='0' )
        {
            return;
        }

        grid[row][col]='0';


        // for neighbour land check

        for(int i =-1;i<=1;i++)
        {
            for(int j =-1;j<=1;j++)
            {


                //  deltarow   and deltacol to check the out of bound condition
                int delrow = i + row;
                int delcol = j+col;


                dfs(grid,delrow,delcol);
            }
        }
    }

}
