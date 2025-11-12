public class SubStringCounts 
{
    public static void main(String args[])
    {
        String s="banana";
        String ss="an";
        String[] parts=s.split(ss);
        int count=parts.length-1;
        System.out.println(count);
    }    
}
