public class WorkingQuickSort {
	private static int array[];
	private int length;
	
	public void sort(int[] inputArr) {	
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}
	
	public void quickSort(int lowerIndex, int higherIndex) {	
		int i = lowerIndex;
		int j = higherIndex;	
		//set pivot as the middle of the section
		int pivot = array[lowerIndex + (higherIndex - lowerIndex)/2];
		System.out.println("pivot" + pivot);
		while (i <= j) { 
			//do this loop until the pointers meet
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}
		for(int z:array){
			System.out.print(z);
			System.out.print(" ");
		}
		System.out.println();
		//recursively call quickSort on the two chunks before/after pivot
		if (lowerIndex < j) {
			quickSort(lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}
	}
	
	public void exchangeNumbers(int a, int b){
		System.out.println(array[a] + " " + array[b]);
		int aVal = array[a];
		int bVal = array[b];
		array[a] = bVal;
		array[b] = aVal;
	}
	
	public static void main(String a[]){
		WorkingQuickSort sorter = new WorkingQuickSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		sorter.sort(input);
		for(int i:input){
			System.out.print(i);
			System.out.print(" ");
		}
	}

}