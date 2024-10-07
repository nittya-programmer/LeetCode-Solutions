class Solution {
    public int minLength(String s) {
        int i=0,j=1;
        while(j<s.length()){
            if(s.substring(i,j+1).equals("AB")||s.substring(i,j+1).equals("CD")){
               s=s.replace(s.substring(i,j+1),"");
                i=0;
                j=1;
            }
            else{
                i++;
                j++;
            }
        }
        return s.length();
    }
}