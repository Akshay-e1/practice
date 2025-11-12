import java.util.*;
public class missingElementsinSorted
{
    public static void main(String args[])
    {
        int[] a={2,1,3,6};
        int[] b={4,7,6,8};
        int[] c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[a.length+i]=b[i];
        }
        Arrays.sort(c);
        System.out.println("missing elements are:");
        for(int i=0;i<c.length-1;i++)
        {
            if(c[i+1]!=c[i]+1)
            {
                for(int j=c[i]+1;j<c[i+1];j++)
                {
                    System.out.print(j+" ");
                }
            }
        }
    }
}