/*

4. Median of Two Sorted Arrays
Solved
Hard
Topics
premium lock icon
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/

class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int arr[] = new int[m + n];
        int i=0;
        int j=0;
        int k=0;

        while( i < nums1.length && j < nums2.length){
            if( nums1[i] < nums2[j]){
                arr[k++] = nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        while( i <nums1.length){
            arr[k++] = nums1[i++];
        } 
        while( j <nums2.length){
            arr[k++] = nums2[j++];
        }

        int total = m+n;
        if( total % 2 ==1) return arr[total / 2];
        return (arr[total/2] + arr[(total / 2) -1] )/ 2.0;
    }
}