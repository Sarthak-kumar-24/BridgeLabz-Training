package com.linearandbinearsearch;

/* Find the Peak Element in an Array
 * 
 * Binary Search to find a peak element in an array. 
 * If there are multiple peak elements, return any one of them.
 */
public class PeakElement {
	
    public static int findPeakElement(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // peak lies on the right side
                left = mid + 1;
            } else {
                // peak lies on the left side or at mid
                right = mid;
            }
        }

        // left == right is a peak index
        return left;
    }
	
	

	public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakElement(arr);

        System.out.println("Peak Index: " + peakIndex);
        System.out.println("Peak Element: " + arr[peakIndex]);

	}

}
