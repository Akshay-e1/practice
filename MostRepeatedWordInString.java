public class MostRepeatedWordInString 
{
    public static void main(String args[])
    {
        String s="banana";
        int[] arr=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int x=(int)ch;
            arr[x]++;
        }

        char maxchar=' '; 
        int maxfreq=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxfreq)
            {
                 maxfreq = arr[i];
                 maxchar=(char)i; 
            }
        }

        System.out.println("most repeated char:" + maxchar);
        System.out.println("max frequency:" + maxfreq);
    }    
}
