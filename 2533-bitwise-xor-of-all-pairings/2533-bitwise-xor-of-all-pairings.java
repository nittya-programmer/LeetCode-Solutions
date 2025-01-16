class Solution {
    //Way-1
    // class Pair{
    //     int firstDigit,secDigit;
    //     Pair(int firstDigit,int secDigit){
    //         this.firstDigit=firstDigit;
    //         this.secDigit=secDigit;
    //     }
    //     public int getXOR(){
    //         return firstDigit^secDigit;
    //     }

    // }
    public int xorAllNums(int[] nums1, int[] nums2) {
    //Way-1
    //     HashSet<Pair> set=new HashSet<>();
    //     int sLength=0;
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
    //             set.add(new Pair(nums1[i],nums2[j]));
    //         }
    //     }
       
    //     boolean fElement=true;
    //     int res=0;
       
    //     for(Pair pair:set){
    //         if(fElement){
    //             fElement=false;
    //             res=pair.getXOR();
    //             continue;
    //         }
    //         res=res^pair.getXOR();
    //     }


    // return res;
    
    //Way-2
    //int res=0;
    //boolean fElement=true;
    //for(int i=0;i<nums1.length;i++){
    //    for(int j=0;j<nums2.length;j++){
            //if(fElement){
                //fElement=false;
                //res=nums1[i]^nums2[j];
                //continue;
            //}
    //        res^=nums1[i]^nums2[j];
    //    }
    //}
    //return res;
    
    // Way-3
    // Set<Integer> set1 = new HashSet<>();
    // Set<Integer> set2 = new HashSet<>();
    // for (int num : nums1) {
    //         set1.add(num);
    //     }
    // for (int num : nums2) {
    //         set2.add(num);
    //     }
    //     int res=0;
       
    // for (int num1 : set1) {
    //         for (int num2 : set2) {
                
    //             res ^= num1 ^ num2;
    //         }
    //     }
        
    //     return res;
int result = 0;
        
        // XOR all elements of nums1 with each element of nums2 if nums2's length is odd
        if (nums2.length % 2 == 1) {
            for (int num : nums1) {
                result ^= num;  // XOR each element of nums1
            }
        }
        
        // XOR all elements of nums2 with each element of nums1 if nums1's length is odd
        if (nums1.length % 2 == 1) {
            for (int num : nums2) {
                result ^= num;  // XOR each element of nums2
            }
        }
        
        return result;
    }
}