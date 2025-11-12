public class FrequencyOfStrings 
{
    public static void main(String[] args)
    {
        String str="banana";
        int[] arr=new int[256];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int x=(int)ch;
            arr[x]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println((char)i+":"+arr[i]);
            }
        }
    }    
}
