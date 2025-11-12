public class UniqueWordsCheckBruteForce
{
    public  static void main(String args[])
    {
        String s="world";
        boolean unique=true;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {
                if(ch==s.charAt(j))
                {
                    unique=false;
                }
            }
        }
        if(!unique)
        {
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }    
}
