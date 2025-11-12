public class CountWordsInString2 
{
    public static void main(String[] args) 
    {
        String s="   iam in  lbrce      ";
        String[] parts=s.trim().split("\\s+");
        
        int count=parts.length;
        System.out.println(count);
    }    
}
