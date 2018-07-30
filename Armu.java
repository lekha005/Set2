import java.util.*;
class Armu
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int m=in.nextInt();
         int sum=0;
         for(int i=n+1;i<m;i++)
         {
             String a=String.valueOf(i);
             for(int j=0;j<a.length();j++)
             {
             int h=Integer.valueOf(a.charAt(j))-'0';
             sum=sum+(h*h*h);
             }
         if(sum==i)
         {
         System.out.print(sum+" ");
         }
      sum=0;
      a="";
         }
    }
}
