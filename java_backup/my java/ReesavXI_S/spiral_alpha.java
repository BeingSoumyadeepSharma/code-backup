import java.util.*;
class spiral_alpha
{
    public static void main(int n)
    {
       Scanner sc=new Scanner(System.in);
       int r=n*n;
       int t,i,j,k,lm,hm;
       int a[][]=new int[n][n];
       t=65;
       for(j=0;j<n;j++)
       {
           i=0;
           a[i][j]=t;
           t++;
       }
       int na,i1,j1,r2,hm1;
       na=r-n;
       lm=1;
       hm=n-1;
       r2=0;  
       int flag=0;
       while(t>=65&&t<=90)
       {
           hm1=hm-1;
           for(i=lm;i<=hm;i++)
           {
              j=hm;
              a[i][j]=t;
              if(t==90)
              flag=-1;
              if(flag==-1)
              {
                  t--;
                  continue;
              }
              t++;
                             
            }
           for(j=hm1;j>=lm-1;j--)
            {
              i=hm;
              a[i][j]=t;
              if(flag==-1)
              {
                  t--;
                  continue;
              }
              
              t++;
             }
             r2=r2+1;
                    if(r2==1)
                    {
                        for(i=hm1;i>=lm;i--)
                        {
                            j=lm-1;
                            a[i][j]=t;
                            if(flag==-1)
                            {
                                t--;
                                continue;
                            }
              
                            t++;
                        }
                        for(j=lm;j<hm;j++)
                        {
                            i=lm;
                            a[i][j]=t;
                            if(flag==-1)
                            {
                                t--;
                                continue;
                            }
              
                            t++;
                        }
                        r2=0;
                        lm++;
                        hm--;
                         
                }               
                if(lm>hm)
                break;
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print((char)a[i][j]+" ");
                }
                System.out.println();
            }
    }
}