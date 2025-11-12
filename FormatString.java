public class FormatString 
{
    public static void main(String[] args)
    {
        String s = "AKSHAY NATH";
        String[] parts = s.split(" ");
        
        String first = parts[1].substring(0,1).toUpperCase()+parts[1].substring(1).toLowerCase();
        String second = parts[0].substring(0,1).toUpperCase()+parts[0].substring(1).toLowerCase();
        System.out.print(first+" "+second);
    }    
}