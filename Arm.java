import java.util.*;
class Arm
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         String a=String.valueOf(n);
         int sum=0;
         for(int i=0;i<a.length();i++)
         {
             int h=Integer.valueOf(a.charAt(i))-'0';
             sum=sum+(h*h*h);
         }
         if(sum==n)
         System.out.print("yes");
         else
         System.out.print("no");
    }
}
