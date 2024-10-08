class Solution {
    public int minSwaps(String s) {
        //Given string is empty so it is already balanced .No swaps required
        if(s.length()==0){
            return 0;
        }
        
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') 
                size++;
            else if (size > 0) 
                size--;
        }
        return (size + 1) / 2;
    
    }
}