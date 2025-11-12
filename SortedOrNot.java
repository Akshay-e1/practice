public class SortedOrNot 
{
    public static void main(String[] args) 
    {
        int[] ar={5, 4, 3, 2, 1,3}; 
        boolean ascending=true;
        boolean descending=true;
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]<ar[i-1])
            {
                ascending=false;
            }
            else if(ar[i]>ar[i-1])
            {
                descending=false;
            }
        }
        if(ascending)
        {
            System.out.println("ascending order");
        }
        else if(descending)
        {
            System.out.println("descending order");
        }
        else
        {
            System.out.println("not in sorted");
        }
    }    
}
