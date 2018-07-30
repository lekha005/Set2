import java.util.*;
class Oddnum
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int a=in.nextInt();
         int b=in.nextInt();
         int c=0;
         for(int i=a+1;i<b;i++)
         {
             if(i%2!=0)
             {
             System.out.print(i+" ");
             }
         }
    }
}
