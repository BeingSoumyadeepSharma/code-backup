import java.util.*;
public class recrev
{ String b[]=new String[100];
    void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("string?");
        String s=sc.nextLine();
        int h=0;
        for(int i=0;i<100;i++)
        b[i]="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                h++;
            }
            else
            b[h]=b[h]+s.charAt(i);
        }
        for(int i=0;i<b.length;i++)
        {
            int c=0;
            rec1(b[i],b[i].length(),c);
            System.out.print(" ");
        }
    }
    void rec1(String s,int l, int c)
    {
        if(c>l-1)
        return;
        System.out.print(s.charAt(l-1-c));
        rec1(s,l,++c);
    }
}
        
