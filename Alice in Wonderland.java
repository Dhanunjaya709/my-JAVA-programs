import java.util.Scanner;
public class Alice
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a,b,c=0;
       a=sc.nextInt();
       while(a>0)
       {
           b=a%10;
           c=c+b;
           a=a/10;
       }
       System.out.println(c);
    }
}
