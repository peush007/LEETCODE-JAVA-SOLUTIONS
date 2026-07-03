class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    void mergeSort(int[] nums, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(nums, left, mid);

            mergeSort(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }
    }

    void merge(int[] nums, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = nums[left + i];
        }

        for (int j = 0; j < n2; j++) {
            arr2[j] = nums[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (arr1[i] <= arr2[j]) {
                nums[k] = arr1[i];
                i++;
            } else {
                nums[k] = arr2[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            nums[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = arr2[j];
            j++;
            k++;
        }
    }
}