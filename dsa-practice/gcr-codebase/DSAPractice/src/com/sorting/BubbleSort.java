package com.sorting;

/* Bubble Sort - Sort Student Marks
 * 
 * A school maintains student marks in an array. 
 * Implement Bubble Sort to sort the student marks in ascending order.
 */
public class BubbleSort {
	
	public static int[] bubbleSort( int[] marks) {
		
		boolean swapped;
		
		for( int i=0; i< marks.length -1; i++) {
			swapped = false;
			
			for( int j=0; j< marks.length-i-1;j++) {
				if( marks[j] > marks[j+1]) {
					
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
                break;
            }
		}
		
		
		return marks;
		
	}

	public static void main(String[] args) {
		int[] studentMarks= { 23, 45, 36, 100, 65,99, 95, 70, 87};
		
		int[] sortedMarks= bubbleSort(studentMarks);
		
		for (int m : sortedMarks) {
            System.out.print(m + " ");
        }
	}

}
