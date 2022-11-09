// Check whether a subarray is of another array
package assignment2;

public class Q6 {
	
	static boolean checkSubarray(int[] arr1, int[] arr2)
	{
		int n = arr1.length;
		int m = arr2.length;
		int i = 0;
		int j = 0;
				
		while (i < n && j < m)
		{
			if (arr1[i] == arr2[j])
			{
				i++;
				j++;
				
				// if the entire subarray length is equal to j then its a subarray
				if (j == m)
				{
					return true;
				}
			}
			else
			{
				// start the check of the subarray from the zeroth index and change the bigger array starting point the next index
				i = i - j + 1;
				j = 0;
			}
		}
		return false;
	}
	
	static void printfn(boolean value)
	{
		if (value)
		{
			System.out.println("Subarray is part of the bigger array");
		}
		else
		{
			System.out.println("Subarray is not part of the bigger array");
		}
	}
	
	public static void main(String[] args)
	{
		int[] bigArr = {1,2,3,4,5,6,7,8,9};
		int[] subArr = {1,2,3,4};
		
		System.out.println("First check....");
		boolean value = checkSubarray(bigArr, subArr);
		Q6.printfn(value);
		
		int[] bigArr1 = {1,2,3,4,5,6,7,8,9};
		int[] subArr1 = {4,5,6,1};
		
		System.out.println("Second check....");
		boolean value1 = checkSubarray(bigArr1, subArr1);
		Q6.printfn(value1);
		
	}
}
