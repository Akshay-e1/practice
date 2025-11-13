public class SumOfDigits {
    public static void main(String args[])
    {
        int a=121;
        int sum=0;
        while(a>0)
        {
            int digit=a%10;
            sum+=digit;
            a=a/10;
        }
        System.out.println(sum);
    }
    
}
