class Solution {
    
    enum Color{
        White, Grey, Black;
    }
    
    public List<Integer> eventualSafeNodes(int[][] a) {
        List<Integer> res = new ArrayList<>();
        if(a.length==0) return res;
        
        Color[] color = new Color[a.length];
        Arrays.fill(color, Color.White);
        
        for(int i=0;i<a.length;i++){
            if(!dfsHasCycle(i, a, color)) res.add(i);
        }
        
        return res;
    }
    
    boolean dfsHasCycle(int cur, int[][] a, Color[] color){
        color[cur]=Color.Grey;
        
        for(int child : a[cur]){
            if(color[child]==Color.Grey) return true;
            if(color[child]==Color.White && dfsHasCycle(child, a, color)) return true;
        }
        
        color[cur]=Color.Black;
        return false;
    }
}