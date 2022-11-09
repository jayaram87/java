// Quick Sort
package assignment2;

public class Q2 {

	// Time complexity o(nlogn) best case, worst case o(n^2), space complexity o(n)
		static int partition(int[] arr, int a, int b)
		{
			int pivot = arr[a];
			int i = a;
			for (int j = i+1; j < b+1; j++)
			{
				if (arr[j] <= pivot)
				{
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				int temp1 = arr[i];
				arr[i] = arr[a];
				arr[a] = temp1;
			}
			return i;
		}
		
		static void quickSort(int[] arr, int n, int m)
		{
			// recursion base condition the n should be less than m
			if (n < m)
			{
				int idx = Q2.partition(arr, n, m); // getting the partition index it will left side of partition elem will all be less than
				// partition idx value and vice versa
				Q2.quickSort(arr, n, idx-1); // left side of the array
				Q2.quickSort(arr, idx+1, m); // right side of the array
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
			Q2.quickSort(arr, n, m);
			
			System.out.println("Sorted array");
			for (int i=0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}


		}

}
