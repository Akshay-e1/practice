public class UniqueWordsCheck
{
    public  static void main(String args[])
    {
        String s="world";
        boolean unique=true;
        boolean[] seen=new boolean[256];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(seen[ch])
            {
                unique=false;
                break;
            }
            seen[ch]=true;
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
