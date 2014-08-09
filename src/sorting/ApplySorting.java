package sorting;

public class ApplySorting {

	public static void main(String[] args) {
		/*
		 * Use the available sorting methods in SortingALgo() class to sort the below array of numbers.
		 */
		int [] array = new int[]{34,45,23,12,67,89,34,56,78,90,3,8,35,2,61,4,9,1,20,7};
		
		int [] bubbleArray = new SortingAlgo().bubbleSort(array);
		
		System.out.println(" Bubble");
		for (int i=0; i<bubbleArray.length; i++){
			System.out.print(" "+bubbleArray[i]);
		} 
		
		System.out.println("Selection");
		
		int [] selectionArray = new SortingAlgo().selectionSort(array);
		for (int i=0; i<selectionArray.length; i++){
			System.out.print(" "+selectionArray[i]);
		} 
		
	}

}
