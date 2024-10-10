public class Solution {
    public static String reverseWords(String s) {
        // Stack<String>stack=new Stack<>();//TC:O(n) and SC:O(n)
        // String str="";
        // int i=0;
        // while(i<s.length()){
        //     if(Character.toString(s.charAt(i)).equals(" ")){
        //         if(!str.trim().equals("")){
        //             stack.push(str+" ");
        //         }
        //         str="";
        //     }
        //     else{
        //         str+=s.charAt(i);
        //     }
        //     i++;
        // }
        // stack.push(str+" ");
        // i=0;
        // s="";
        // while(!stack.isEmpty()){
        //     s+=stack.peek();
        //     stack.pop();
        // }
        // return s.trim();
        
        String str1="";
       String str2="";
        int i=s.length()-1;
        while(i>=0){
            if(!Character.toString(s.charAt(i)).equals(" ")){
                str1=s.charAt(i)+str1;
            }
            else{
                if(!str1.trim().equals("")){
                    str2+=str1+s.charAt(i);
                }
               str1="";
            }
            i--;
            
        }
        str2+=str1;
       return str2.trim(); 
    }
} 