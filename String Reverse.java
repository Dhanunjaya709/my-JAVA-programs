import java.util.Scanner;
public class String4
{
    public static void main(String[] args)
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.nextLine();
        String str1=new StringBuffer(str).reverse().toString();
        System.out.println(str1);
    }
}
