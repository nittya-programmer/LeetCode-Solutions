class Solution {
    public boolean rotateString(String s, String goal) {
        // Solution 1
         if(s.length()!=goal.length()){
            return false;
        }
        s=s+s;
        return s.contains(goal);//O(n2)
        //Solution 2
        // if(s.length()!=goal.length()){
        //     return false;
        // }
        // for(int i=0;i<s.length();i++){
        //     //Check in each shifted form of string with goal string, if they are idetical 
        //     //then return true
        //     String msbStr=Character.toString(s.charAt(s.length()-1));
        //     String temp="";
        //     for(int j=s.length()-1;j>0;j--){
        //         temp=s.charAt(j-1)+temp;
        //     }
        //     temp=msbStr+temp;
        //     if(temp.equals(goal)){
        //         return true;
        //     }
        //     s=temp;
        // }
        // return false;
    }
}