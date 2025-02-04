class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxWater=Integer.MIN_VALUE;
        while(l<r){
            maxWater=Math.max(maxWater,((r-l)*(Math.min(height[r],height[l]))));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return maxWater;
    }
}