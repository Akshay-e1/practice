import java.util.*;
public class Ksmallest {
    public static void main(String[] args) {
        int[] a={6,1,2,5,3,9};
        int k=2;
         Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<k;i++)
        {
            System.out.println(a[i] +" ");
        }
    }
    
}
