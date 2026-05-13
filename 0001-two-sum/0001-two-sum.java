class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute Force Solution: TC=O(N^2) SC=O(1)
        //Key Idea: Traverse each and every pair of elmnts present in an array and compare the sum of these values with target value
        /* 
        int start=0, end=nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
        */

        //Optimized Solution: TC=O(N) and SC=O(N)
        //Key Idea: We will take one by one element from array and check for compelent if prsent in hash table then return the indices otherwise will save the element with respective index as key-value pair

        //Initialize complement variable
        int complement;
        //Initialize hash table
        Map <Integer, Integer> map = new HashMap<>();
        // Iterate each and every element of nums array
        for(int value=0;value<nums.length;value++){
           complement=target-nums[value];
           if(map.containsKey(complement)){
            return new int[]{value,map.get(complement)};
           }
           map.put(nums[value],value);
        }
        return new int[]{0,0};





    }
}