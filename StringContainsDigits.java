public class StringContainsDigits 
{
    public static void main(String args[])
    {
        String s="Aksh1ay";
        boolean digit=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
            {
                digit=true;
                break;
            }
        }
        if(!digit)
        {
            System.out.println("all are alphabets");
        }
        else
        {
            System.out.println("numbers");
        }
    }    
}
