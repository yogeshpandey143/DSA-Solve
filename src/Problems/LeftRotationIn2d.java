package Problems;

public class LeftRotationIn2d {
// left rotation can be done by using reverse function
    // reverse(arr,0,n);
// reverse(arr,0,k);
    // reverse(arr,0,n);
    int[][] rotateMatrix(int k, int mat[][]) {

        int rows = mat.length;
        int cols = mat[0].length;

        k = k % cols;  // Effective rotation

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][(j + cols - k) % cols] = mat[i][j];
            }
        }

        return result;


}
