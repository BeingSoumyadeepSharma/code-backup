import java.util.*;
class oct_to_bin
{
    double num;
    oct_to_bin(double n)
    {
        num=n;
    }
    void calc()
    {
        int a=0,b=0,s=0,r=0;
        a=(int)num;
        r=a;
        while(a>0)
        {
            b=a%10;
            s=(s*10)+b;
            a=a/10;
        }
        while(s>0)
        {
            b=s%10;
            if(b==0)
            System.out.print("000");
            else if(b==1)
            System.out.print("001");
            else if(b==2)
            System.out.print("010");
            else if(b==3)
            System.out.print("011");
            else if(b==4)
            System.out.print("100");
            else if(b==5)
            System.out.print("101");
            else if(b==6)
            System.out.print("110");
            else if(b==7)
            System.out.print("111");
            s=s/10;
        }
        double a1;
        a1=num-r;
        System.out.print(".");
        while(a1!=0)
        {
            a1=a1*10;
            b=(int)a1;
            if(b==0)
            System.out.print("000");
            else if(b==1)
            System.out.print("001");
            else if(b==2)
            System.out.print("010");
            else if(b==3)
            System.out.print("011");
            else if(b==4)
            System.out.print("100");
            else if(b==5)
            System.out.print("101");
            else if(b==6)
            System.out.print("110");
            else if(b==7)
            System.out.print("111");
            a1=a1-b;
        }
    }
}