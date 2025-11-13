public class NprimeNums {
    public static void main(String args[]) {
        int n = 10;
        for (int i = 2; i <= n; i++) 
        {
            int j;
            for (j = 2; j < i; j++) 
            {
                if (i % j == 0) 
                {
                    break;
                }
            }
            if (i == j) 
            {
                System.out.print(i + " ");
            }
        }
    }
}
