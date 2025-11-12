import java.util.*;
public class Klargest {
    public static void main(String[] args) {
        int[] a={6,1,2,5,3,9};
        int k=2;
         Arrays.sort(a);
        int n=a.length;
        for(int i=n-k;i<n;i++)
        {
            System.out.println(a[i] +" ");
        }
    }
    
}
