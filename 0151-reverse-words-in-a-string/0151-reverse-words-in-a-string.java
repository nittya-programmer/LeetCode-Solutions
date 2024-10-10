public class Solution {
    public static String reverseWords(String s) {
        Stack<String>stack=new Stack<>();
        String str="";
        int i=0;
        while(i<s.length()){
            if(Character.toString(s.charAt(i)).equals(" ")){
                if(!str.trim().equals("")){
                    stack.push(str+" ");
                }
                str="";
            }
            else{
                str+=s.charAt(i);
            }
            i++;
        }
        stack.push(str+" ");
        i=0;
        s="";
        while(!stack.isEmpty()){
            s+=stack.peek();
            stack.pop();
        }
        return s.trim();
    }
} 