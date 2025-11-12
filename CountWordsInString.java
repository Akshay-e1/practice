public class CountWordsInString 
{
    public static void main(String[] args) 
    {
        String s="  iam in    lbrce  ";
        int count=0;
        boolean inword=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch != ' ' && !inword)
            {
                inword=true;
                count++;
            }
            else if(ch==' ')
            {
                inword=false;
            }
        }
        System.out.print(count);
    }    
}
