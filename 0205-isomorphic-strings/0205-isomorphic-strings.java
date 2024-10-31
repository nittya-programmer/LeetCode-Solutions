class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
       
        //Special case:
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(map.containsKey(sc)){
                if(map.get(sc)!=tc){
                    return false;
                }
            }
            else if(map.containsValue(tc)){
                return false;
            }
            map.put(sc,tc);
        }
        return true;
        }
        
}
