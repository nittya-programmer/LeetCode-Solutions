class Solution {
    int noOfChange=0;
    public int minChanges(String s) {
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i+1)){
                noOfChange++;
            }
        }
        return noOfChange;
    }
}