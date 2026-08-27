class Solution {
    public int maxArea(int[] heights) {
        int maxW=0;
        int n=heights.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int a=Math.min(heights[i],heights[j]);
            maxW=Math.max(maxW,a*(j-i));
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxW;
    }
}
