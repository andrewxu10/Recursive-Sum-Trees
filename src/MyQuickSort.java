import java.lang.reflect.Array;
import java.util.ArrayList;
public class MyQuickSort {
	private static int array[][];
	private int length;
	public static int[] getNuts(int array[][]) {
		return array[0]; //first array
	}
	public static int[] getBolts(int array[][]) {
		return array[1]; //second array
	}
	public static void setNuts(int[] newNuts) {
		array[0] = newNuts;
	}
	public static void setBolts(int[] newBolts) {
		array[1] = newBolts;
	}
	
	public void sort(int[][] inputArr) {
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		//assumes nuts/bolts length == each other
		length = getNuts(array).length;
		nutSort(getNuts(array), getBolts(array), 0, length - 1);
	}
	
	public void nutSort(int[] n, int[] b, int lowerIndex, int higherIndex) {
		int[] nuts = n;
		int[] bolts = b;
		int i = lowerIndex; //indexes to sort the first array with
		int j = higherIndex;
		int pivot = nuts[lowerIndex + (higherIndex - lowerIndex)/2]; //set in parameters
		int pivotIndex = -1;
		while (i <= j) {
			////if there is a pivot index, while pivot index is to the right of i	
			while (nuts[i] < pivot) {
				i++;
			}
			while (nuts[j] > pivot) {
				j--;
			}
			System.out.println(nuts[i] + " " + nuts[j]);
			if (i <= j) { //perform swap, record pivotIndex	
				//exchangeNumbers(i, j);
				int a1 = nuts[i];
				int b1 = nuts[j];
				nuts[j] = a1;
				nuts[i] = b1;
				i++;
				j--;
				//setNuts(nuts);
//				if (pivot == i) { //record index in array b containing pivot, if found
//					pivotIndex = b[i];
//				}
//				if (pivot == j) {
//					pivotIndex = b[j];
//				}
			}
			//System.out.println(pivotIndex);
			//if at any point they try to use -1 as a pivotIndex, the pivot wasn't found
		}
		System.out.println("pivot = " + pivot);
		setNuts(nuts);
	}
	public void quickSort(int lowerIndex, int higherIndex) {	
		int i = lowerIndex;
		int j = higherIndex;	
		//set pivot as the middle of the section
		int pivot = getNuts(array)[lowerIndex + (higherIndex - lowerIndex)/2];
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
		
		//recursively call quickSort on the two chunks before/after pivot
		if (lowerIndex < j) {
			quickSort(lowerIndex, j);
		}
		
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}
	}
	
	public void exchangeNumbers(int a, int b, boolean first){
		if(first) {
			int aVal = array[0][a];
			int bVal = array[0][b];
			array[0][a] = bVal;
			array[0][b] = aVal;
		} else {
			int aVal = array[1][a];
			int bVal = array[1][b];
			array[1][a] = bVal;
			array[1][b] = aVal;
		}
	}
	
	public static void main(String a[]){
		
		MyQuickSort sorter = new MyQuickSort();
		int[] b1 = {24,2,45,20,56,75,2,56,99,53,12};
		int[] b2 = {1,1,1,1,1,1,1,1,1,1,1};
		//int[] b2 = {12,53,99,56,2,75,56,20,45,2,24}; 
		int[][] input = {b1,b2};
		//processes input as param, attempts to sort
		sorter.sort(input);

		
//		sorter.setNuts(b2);
		int[] output = sorter.getNuts(array);
		for(int i:output){
			System.out.print(i);
			System.out.print(" ");
		}

	}

}