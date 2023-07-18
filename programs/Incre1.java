public class Incre1
{
    public static void main(String[] args) 
    {
        int i = 11;
         
        i = i++ + ++i; // 11 (12) + 13 (13) = 24
         
        System.out.println(i);
    }
}