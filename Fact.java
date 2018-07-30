import java.util.*;
class Fact
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int sum=1;
         for(int i=1;i<=n;i++)
         {
            sum*=i;
         }
         System.out.print(sum);
    }
}
