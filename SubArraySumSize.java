public class SubArraySumSize 
{
    public static void main(String[] args) 
    {
    int[] ar={1,2,3,4,5,6,7,8,9,10};
    int size=3;
    for(int i=0;i<=ar.length-size;i++)
    {
        int sum=0;
        for(int j=i;j<i+size;j++)
        {
            System.out.print(ar[j]+" ");
            sum+=ar[j];
        }
        System.out.println("=>sum is "+sum);
    } 
}
}