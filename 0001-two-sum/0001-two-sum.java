class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force: compare each and every pair 
        //time complexity:O(n2)
        /*
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[]{-1,-1};
        */
        //using hashmap: for both when given array is sorted and unsorted
        //time complexity:O(n)
        
        HashMap<Integer,Integer>hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(hmap.containsKey(diff)){
                return new int[]{hmap.get(diff),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
        //using two pointer: only when given array is sorted
        //time complexity:O(n)
        /*int leftPointer=0,rightPointer=nums.length-1;
        while(leftPointer<=rightPointer){
            if(nums[leftPointer]+nums[rightPointer]>target){
                rightPointer--;
            }
            else if(nums[leftPointer]+nums[rightPointer]<target){
                leftPointer++;
            }
            else{
                return new int[]{leftPointer,rightPointer};
            }
        }
        return new int[]{-1,-1};
        */
    }
}