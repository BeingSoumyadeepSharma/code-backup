import java.util.*;
public class daydiff
{
    public static void main(String args[])
   
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("day");
        int d1=sc.nextInt();
        System.out.println("month");
        int m1=sc.nextInt();
        System.out.println("year");
        int y1=sc.nextInt();
        int td=0;
        System.out.println("day");
        int d2=sc.nextInt();
        System.out.println("month");
        int m2=sc.nextInt();
        System.out.println("year");
        int y2=sc.nextInt();
        
        for(int i=y1;i<y2;i++)
        {
            if(i%4==0)
            td=td+366;
            else
            td=td+365;
        }
        for(int i=m1;i<m2;i++)
        td=td+30;
        td=td+(d2-d1);
        System.out.println("total days = "+td);
        
    }
}
        