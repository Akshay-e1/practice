public class RemoveDuplicatesInStrings
{
    public static void main(String args[])
    {
        String s="aakshayy";
        StringBuilder res = new StringBuilder();
        boolean[] seen = new boolean[256];

        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if(!seen[ch])
            {
                res.append(ch);
                seen[ch]=true;
            }
        }
        System.out.println(res);
        
    }
}
