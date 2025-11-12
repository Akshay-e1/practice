import java.util.*;
public class MedianOf2SortedArrays 
{
    public static void main(String[] args) 
    {
        int[] a={2,3,1,5};
        int[] b={7,8,4,6};
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
        for(int i=0;i<c.length;i++)
        {
        System.out.print(c[i]+" ");
        }
        System.out.println();
        int n=c.length;
        double median;
        if(n%2==0)
        {
            median=(c[n/2-1]+c[n/2]/2.0);
        }
        else
        {
            median=c[n/2];
        }
        System.out.println("median:"+median);
        
    }    
}

