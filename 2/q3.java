//Bubble sort
package assignment2;

public class q3 {
	
	static void bubbleSort(int[] arr)
	{
		int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
        	for (int j = 0; j < n - i - 1; j++)
        	{
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        	}
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,4,3,5,1,2};
		
		System.out.println("Unsorted array");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		q3.bubbleSort(arr);
		
		System.out.println("Sorted array");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
	}

}
