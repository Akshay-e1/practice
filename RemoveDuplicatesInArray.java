import java.util.*;
public class RemoveDuplicatesInArray 
{
    public static void main(String args[])
    {
        int[] arr={2,1,2,3,4,5,1};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    } 
}
