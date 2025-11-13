public class LinearSearch {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int key=11;
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println("found");
                break;
            }
            System.out.println("not");
            break;
        }
    }
    
}
