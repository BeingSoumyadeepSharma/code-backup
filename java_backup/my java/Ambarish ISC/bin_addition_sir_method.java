import java.util.*;
class bin_addition_sir_method
{
    int n=0,n1=0;
    bin_addition_sir_method(int num,int num1)
    {
        n=num;
        n1=num1;
    }
    void clac()
    {
        int cr=0,a=0,a1=0,i=0;
        String s=" ";
        while(n>0||n1>0||cr!=0)
        {
            a=n%10;
            a1=n1%10;
                if(a==0&&a1==0&&cr==0)
                {
                    cr=0;
                s=s+"0";
            }
                else if(a==0&&a1==1&&cr==0)
                {
                    cr=0;
                s=s+"1";
            }
                else if(a==1&&a1==0&&cr==0)
                {
                    cr=0;
                s=s+"1";
            }
                else if(a==1&&a1==1&&cr==0)
                {
                    s=s+"0";
                    cr=1;
                }
             else if(a==0&&a1==0&&cr==1)
              {
                cr=0;  
                s=s+"1";
            }
                else if(a==0&&a1==1&&cr==1)
                {
                cr=1;    
                s=s+"0";
            }
                else if(a==1&&a1==0&&cr==1)
                {
                    cr=1;
                    s=s+"0";
            }
                else if(a==1&&a1==1&&cr==1)
                {
                    s=s+"1";
                    cr=1;
                }
            n=n/10;
            n1=n1/10;
        }
        for(i=s.length()-1;i>=0;i--)
        System.out.print(s.charAt(i));
    }
}