class Solution {
    public int trap(int[] height) {
        int water=0;
        int n=height.length;
        int Lmax=height[0];
        int Rmax=height[n-1];
        int l=0;
        int r=n-1;

        while(l<r){
            Lmax=Math.max(Lmax,height[l]);
            Rmax=Math.max(Rmax,height[r]);

            if(Lmax<Rmax){
                water+=Lmax-height[l];
                l++;
            }else{
                water+=Rmax-height[r];
                r--;
            }
        }
        return water;
    }
}
