//Selection sort
package assignment2;

public class Q5 {

	static void selectionSort(int[] arr)
	{
        int n = arr.length;
 
    	// sort from the current index upto the min value and swap; time complexity o(n^2)
        for (int i = 0; i < n-1; i++)
        {
            int minIdx = i;
            for (int j = i+1; j < n; j++)
            {
                if (arr[j] < arr[minIdx])
                {
                	// set the minIdx to the min values index
                	minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,4,3,5,1,2};
		
		System.out.println("Unsorted array");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// static method without a instance call
		Q5.selectionSort(arr);
		
		System.out.println("Sorted array");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
	}

}
