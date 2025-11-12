public class TwoSum 
{
    public static void main(String[] args) 
    {
       int[] arr={1,2,1,1};
       int sum=3;
       for(int i=0;i<arr.length;i++)
       {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]+arr[j]==sum)
            {
                System.out.println(arr[i]+" + "+arr[j]+" = "+sum);
            }
        }
       } 
    }    
}
