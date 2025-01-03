class Solution {
    // public int getSum(int start,int end,int[]nums){
    //     int sum=0;
    //     for(int i=start;i<=end;i++){
    //         sum+=nums[i];
    //     }
    //     return sum;
    // }
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int validSplit=0;
        long prefixNums[]=new long[nums.length];
        long preSum=0;
        for(int i=0;i<n;i++){
            preSum+=nums[i];
            prefixNums[i]=preSum;
        }
        for(int i=0;i<n-1;i++){
            // if(getSum(0,i,nums)>=getSum(i+1,n-1,nums)){
            //     validSplit++;
            // }
            if(prefixNums[i]>=(prefixNums[n-1]-prefixNums[i])){
               validSplit++; 
            }
        }
        return validSplit;
    }
}