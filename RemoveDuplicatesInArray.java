import java.util.*;
public class RemoveDuplicatesInArray 
{
    public static void main(String args[])
    {
        int[] arr = {2,1,2,3,4,5,1};

        Arrays.sort(arr); 

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < arr.length; i++)
        {
            if(i == 0 || arr[i] != arr[i - 1])
            {
                System.out.print(arr[i] + " ");
            }
        }
    } 
}
