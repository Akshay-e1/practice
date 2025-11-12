public class MaxRepeatedElements 
{
    public static void main(String args[])
    {
        int[] a = {29, 1, 2, 1, 3, 4, 1, 5, 6, 1};
        int count = 0;
        int max = 0;
        int ele = 0;

        for (int i = 0; i < a.length; i++)
        {
            count = 1;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] == a[j])
                {
                    count++;
                }
            }

            if (count > max)
            {
                max = count;
                ele = a[i];
            }
        }

        System.out.println(ele + " occurs " + max + " times");
    }    
}
