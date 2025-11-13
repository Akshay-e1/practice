public class BinarySearch {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int key=22;
        int l=0,h=arr.length-1,mid;
        while(l<=h)
        {
            mid=(l+h)/2;
            if(arr[mid]==key)
            {
                System.out.print(mid);
                return;
            }
                if(arr[mid]<key)
                {
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
        }
        System.out.print("not found");
    }
    
}
