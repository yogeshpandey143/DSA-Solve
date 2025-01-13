package revisionProblem;

public class ContainerArea {

    public static int maxArea(int[] height) {
        int ans=0;
        int n = height.length;
        int i=0, j=n-1;

        while(i<j)
        {

            int area =Math.min(height[i],height[j])*(j-i);
            if(area>ans) ans=area;
            if(height[i]<height[j]) i++;
            else j--;
        }

        return ans;
    }

    public static void main(String[] args) {
   int[] height= {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
