import java.util.Scanner;
public class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
        float r=sc.nextFloat();
        System.out.println(s*s);
        System.out.println(l*b);
        System.out.printf("%1.2f",3.141*r*r);
        
    }
}
