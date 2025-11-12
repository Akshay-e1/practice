public class ArrayRotations 
{
    public static void main(String args[]) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        int[] rotate = new int[n];
        for (int i = 0; i < n; i++) 
        {
            rotate[i] = arr[(i + k) % n];
        }

        System.out.println("Left rotation:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(rotate[i] + " ");
        }

        System.out.println();

        int[] rotateRight = new int[n];
        for (int i = 0; i < n; i++) 
        {
            rotateRight[(i + k) % n] = arr[i];
        }

        System.out.println("Right rotation:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(rotateRight[i] + " ");
        }
    }
}
