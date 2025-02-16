class Solution {
    int findIdx(int key,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }

        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Bruteforce Approach
        int nge[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            nge[i]=-1;
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=findIdx(nums1[i],nums2)+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    nge[i]=nums2[j];
                    break;
                }
            }
            
        }
        return nge;
    }
}