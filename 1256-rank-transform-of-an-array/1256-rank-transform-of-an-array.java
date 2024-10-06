class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int temp_arr[] =new int[arr.length];
        for(int k=0;k<arr.length;k++){
            temp_arr[k]=arr[k];
        }
        Arrays.sort(temp_arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if(!map.containsKey(temp_arr[i])){
        //         map.put(temp_arr[i], i + 1);
        //     }
        //     else{i--;}
        // }
        int i=0,rank=1;
        while(i<arr.length){
            if(!map.containsKey(temp_arr[i])){
                map.put(temp_arr[i],rank);
                rank++;
            }
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = map.get(arr[j]);
        }
        return arr;
    }
}