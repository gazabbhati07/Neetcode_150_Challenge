class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int ans=0;

        while(left<right){
            if(heights[left]<heights[right]){
                ans=Math.max(ans,heights[left]*(right-left));
                left++;
            }else{
                ans=Math.max(ans,heights[right]*(right-left));
                right--;

            }
        }
        return ans;
    }
}
