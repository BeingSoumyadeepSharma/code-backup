import java.util.*;
class ARR_LCM
{
    int n;
    ARR_LCM (int s)
    {
        n=s;
    }
    void clac()
    {
        Scanner sc=new Scanner(System.in);
        int i=0,mult=1,j=0,f=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("enter number");
            a[i]=sc.nextInt();
            mult=mult*a[i];
        }
        for(i=1;i<=mult;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i%a[j]==0)
                f++;
            }
            if(f==n)
            {
                System.out.print("LCM="+i);
                break;
            }
            else
            f=0; 
        }
    }
}
                  