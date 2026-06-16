class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = 0;
        int p2 = 0;
        int k = 0;
       

        int[] arr = new int[m+n];

        while(p1 < m && p2 < n){
            if(nums1[p1] <= nums2[p2]){
                arr[k] = nums1[p1];
                p1++;
            }

            else{
                arr[k] = nums2[p2];
                p2++;
            }
            k++;
        }

        while(p1 < m){
            arr[k] = nums1[p1];
            p1++;
            k++;
        }

        while(p2 < n){
            arr[k] = nums2[p2];
            p2++;
            k++;
        }
        for(int i = 0; i < m+n; i++){
            nums1[i] = arr[i];
        }
        
    }
}