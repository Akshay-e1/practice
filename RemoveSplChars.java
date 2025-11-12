public class RemoveSplChars 
{
    public static void main(String[] args) 
    {
        String s="a@ksh%a^Y";
        String c="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
            {
                c+=ch;
            }
        }    
        System.out.println(c);
    }    
}
