class Solution {
    public int countZerosAndOnes(String str, int i) {
        int noOfZerosAndOnes = 0;
        for (int itr = 0; itr < str.length(); itr++) {
            if (itr +1<= i && str.charAt(itr) == '0' || itr+1 > i && str.charAt(itr) == '1') {
                noOfZerosAndOnes++;
            }
        }
        return noOfZerosAndOnes;

    }
    public int maxScore(String s) {
        int maxScore=0;
         for(int i=1;i<s.length();i++){
            maxScore=Math.max(maxScore, countZerosAndOnes(s, i));
        }
        return maxScore;
    }
    
}