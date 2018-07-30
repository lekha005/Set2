import java.util.*;
class Pal
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         String a=in.next();
         String b="";
         for(int i=a.length()-1;i>=0;i--)
         {
             b=b+String.valueOf(a.charAt(i));
         }
         if(a.contains(b))
        System.out.print("yes");
        else
        System.out.print("no");
    }
}
