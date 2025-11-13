public class GCDLCM {
    public static void main(String args[])
    {
        int a=5;
        int b=2;
        int gcd=0;
        for(int i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        int lcm=(a*b)/gcd;
        System.out.println("gcd:"+gcd);
        System.out.println("lcm:"+lcm);
    }
    
}
