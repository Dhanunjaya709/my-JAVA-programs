import java.util.Scanner;
public class Budget
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      int e=sc.nextInt();
      double f=a*350.34;
      double g=b*230.90;
      double h=c*190.55;
      double i=d*125.30;
      double j=e*180.90;
      double k=f+g+h+i+j;
      if(k>=15000)
      System.out.println("no");
      else
      System.out.println("yes");
      
      
      
    }
}
