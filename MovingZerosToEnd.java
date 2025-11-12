public class MovingZerosToEnd {
    public static void main(String args[]) {
        int[] arr = {0, 1, 2, 3, 1, 4, 0};
        int n = arr.length;

        int z = 0; // pointer for zero position

        for (int nz = 0; nz < n; nz++) {
            if (arr[nz] != 0) {
                // swap non-zero with zero position
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                z++;
            }
        }

        // print result
        for (int i = 0; i < arr.length; i++) 
        {
        System.out.print(arr[i] + " ");
        }
    }
}
