class Solution {
    public long minEnd(int n, int x) {
        //long nums[]=new long [n];
        //nums[0]=x;
        int y=x+1,i=1;
        long curr=x;
        long res=x;
        while(i<n){
            // if((x&y)==x){
                // nums[i]=y;
                curr=x|(curr+1);
                res=curr;
                i++;
            // }
            // y++;
        }
        return res;
    }
}