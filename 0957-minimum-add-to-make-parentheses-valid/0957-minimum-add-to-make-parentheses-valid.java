class Solution {
    public int minAddToMakeValid(String s) {
      //Bruteforce approach : TC=O(n) and SC=O(n)
    //    Stack<Character> stack=new Stack<>();
    //     for(int i=0;i<s.length();i++){
            
    //          if(s.charAt(i)==')' && !stack.isEmpty() &&stack.peek()=='('){
    //             stack.pop();
    //         }
    //         else{
    //              stack.push(s.charAt(i));
    //         }
    //     }
    //     return stack.size();
        //Optimized approach : TC=O(n) and SC=O(1)
        int count=0,mismatched=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else{
                if(count>0){
                    count--;
                }
                else{
                    mismatched++;
                }
            }
        }
        return mismatched+count;
    }
}