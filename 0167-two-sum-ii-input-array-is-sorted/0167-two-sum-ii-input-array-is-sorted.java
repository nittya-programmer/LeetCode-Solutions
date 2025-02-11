class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0,rp=numbers.length-1;
        int arr[]={-1,-1};
        while(lp<rp){
            if(numbers[lp]+numbers[rp]==target){
                arr[0]=lp+1;
                arr[1]=rp+1;
                return arr;

            }
            else if(numbers[lp]+numbers[rp]<target){
                lp++;
            }
            else if(numbers[lp]+numbers[rp]>target){
                rp--;
            }

        }
        return arr;

    }
}