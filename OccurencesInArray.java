import java.util.*;
public class OccurencesInArray 
{
    public static void main(String args[])
    {
        int[] ar= {2, 3, 2, 4, 3, 2, 5};
        Arrays.sort(ar);
        int count=1;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]==ar[i-1])
            {
                count++;
            }
            else
            {
                System.out.println(ar[i-1]+" occurs "+count);
                count=1;
            }
        }
         System.out.println(ar[ar.length-1]+ " occur "+count+" times");
    }
}
