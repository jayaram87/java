// Merge Sort
package assignment2;

public class Q4 {
	// Time complexity o(nlogn), space complexity o(n)
	static void mergeProcedure(int[] arr, int a, int b, int c)
	{
		int leftElems = b - a + 1; // nbr of elements in an array would be endidx - startidx + 1, mid - startidx + 1
		int rightElems = c - b; // endidx - mid - 1 + 1
		
		int[] leftArr = new int[leftElems];
		int[] rightArr = new int[rightElems];
		
		// filling the left and right new arrays
		for (int i = 0; i < leftElems; i++)
		{
			leftArr[i] = arr[a+i];
		}
		for (int j = 0; j < rightElems; j++)
		{
			rightArr[j] = arr[b+1+j];
		}
		
		int i=0, j=0, k=a; // merge the arrays
		while (i < leftElems && j < rightElems)
		{
			if (leftArr[i] <= rightArr[j])
			{
				arr[k] = leftArr[i];
				i++;
			}
			else
			{
				arr[k] = rightArr[j];
				j++;
			}
		}
		
		// copying the remaining left array elements
		while (i < leftElems)
		{
			arr[k] = leftArr[i];
			k++;
			i++;
		}
		
		// copying the remaining right array elements
		while (j < rightElems)
		{
			arr[k] = rightArr[j];
			k++;
			j++;
		}
		
	}
	
	static void mergeSort(int[] arr, int n, int m)
	{
		// recursion base condition the n should be less than m
		if (n < m)
		{
			int mid = n + (m-n)/2;
			Q4.mergeSort(arr, n, mid); // left side of the array, dividing part
			Q4.mergeSort(arr, mid+1, m); // right side of the array, dividing part
			Q4.mergeProcedure(arr, n, mid, m); // sorting procedure, conquering part
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,4,3,5,1,2};
		int n = 0;
		int m = arr.length-1;
		
		System.out.println("Unsorted array");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// static method without a instance call
		Q4.mergeSort(arr, n, m);
		
		System.out.println("Sorted array");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}


	}

}
