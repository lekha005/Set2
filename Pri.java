import java.util.*;
class Pri
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int a=in.nextInt();
         int c=0;
         for(int i=1;i<=a;i++)
         {
             if(a%i==0 && a!=1)
             {
             c++;
             }
         }
         if(c==2)
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
