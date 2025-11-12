public class FirstedRepeatedElement 
{
    public static void main(String args[])
    {
        int[] a={9,2,3,1,4,1,5};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[j]);
                }
            }
        }
    }    
}
