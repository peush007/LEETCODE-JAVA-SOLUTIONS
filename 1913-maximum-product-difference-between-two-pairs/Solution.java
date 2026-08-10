class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int smallest = nums[0];
        int secSmallest = nums[1];

        int largest = nums[n-1];
        int secLargest = nums[n-2];
        return (largest*secLargest) - (smallest*secSmallest);        
    }
}