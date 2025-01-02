class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int pre[]=new int[words.length];
        int ans[]=new int[queries.length];
        int count=0;
        for(int i=0;i<words.length;i++){
            if("aeiou".indexOf(words[i].charAt(0))!=-1 &&"aeiou".indexOf(words[i].charAt(words[i].length()-1))!=-1 ){
                count++;
            }
            pre[i]=count;
        }
        for(int j=0;j<queries.length;j++){
            if(queries[j][0]==0){
                ans[j]=pre[queries[j][1]];
            }
            else{
                ans[j]=pre[queries[j][1]]-pre[queries[j][0]-1];
            }
            
        }
        return ans;
    }
    
}