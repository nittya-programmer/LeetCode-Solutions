class Solution {
    public String largestOddNumber(String num) {
        /*
         * Wrong Code
         * if ((Integer.valueOf(num) & ((1 << 1) - 1)) != 0) {
         * return num;
         * }
         * int i = 0, n = num.length();
         * while (i < n / 2) {
         * int numVal1 = Integer.valueOf(num.substring(i, n - 1 - i));
         * if ((numVal1 & ((1 << 1) - 1)) != 0) {// left part not divisible by 2
         * int numVal2 = Integer.valueOf(num.substring(i + 1, n - i));
         * if ((numVal2 & ((1 << 1) - 1)) != 0) {// right part not divisible by 2
         * return String.valueOf(Math.max(numVal1, numVal2));
         * } else {// right portion divisible by 2
         * return String.valueOf(numVal1);
         * }
         * 
         * }
         * int numVal2 = Integer.valueOf(num.substring(i + 1, n - i));
         * if ((numVal2 & ((1 << 1) - 1)) != 0) {// right part not divisible by 2
         * return String.valueOf(numVal2);
         * }
         * i++;
         * 
         * }
         * int maxNum=Integer.MIN_VALUE;
         * for(i=0;i<n;i++){
         * if(((Integer.valueOf(Character.toString(num.charAt(i))))& ((1 << 1) - 1)) !=
         * 0){
         * maxNum=Math.max(maxNum,Integer.valueOf(Character.toString(num.charAt(i))));
         * }
         * }
         * if(maxNum>0){
         * return String.valueOf(maxNum);
         * }
         * else{
         * return "";
         * }
         */
         String val="";
         String maxOdd="";
        for(int i=0;i<num.length();i++){
            val=val+Character.toString(num.charAt(i));
            if((Integer.valueOf(val.charAt(i))&((1<<1)-1))!=0){
                maxOdd=val;
            }
        }
        return maxOdd;
    }

}
