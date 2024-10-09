class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length()==0){
            return s;
        }
        int i=0,count=0;
        String str="";
        while(i<s.length()){
            if(s.charAt(i)=='('){
                if(count>0){
                   str+=s.charAt(i); 
                }
                count++;
            }
            else if(s.charAt(i)==')'){
                
                count--;
                if(count>0){
                    str+=s.charAt(i); 
                }

            }
           
            i++;
        }
        return str;
    }
}