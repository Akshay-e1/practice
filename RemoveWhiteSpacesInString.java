public class RemoveWhiteSpacesInString 
{
    public static void main(String[] args) 
    {
        String s=" a b c ";
        String w="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(s.charAt(i)!=' ')
            {
                w+=ch;
            }

        }   
        System.out.print(w); 
    }    
}
