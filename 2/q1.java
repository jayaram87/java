// Find duplicates in an array
package q1;

public class q1
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        boolean duplicates = false;
        l1: {for (int i=0; i < arr.length; i++){
                for (int j=i; j < arr.length-i; i++)
                {
                    if (arr[i] == arr[j])
                    {
                        duplicates = true;
                        break l1;
                    }
                }
            }
        }
        System.out.println("Result: "+duplicates);
    }
}