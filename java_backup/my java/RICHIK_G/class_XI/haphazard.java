package class_XI;

import java.io.*;
public class haphazard
{
    public static void main(String args [])throws IOException
    {
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int n;int i;int j;
System.out.println("Enter value form");
n=Integer.parseInt(br.readLine());
int a[]= new int[n];
for (i=0;i<n;i++)
{
System.out.println("Enter value ");
a[i]=Integer.parseInt(br.readLine());
}
 int mid=n/2;
int str=0;int max=0;
for(i=0;i<n;i++)
{
    for(j=0;j<n-i-1;j++)
    {   if(a[j]<a[j+1])
        {
             max=a[j+1];
        }
    }
int t=a[mid];

a[mid]=max;
}
for(i=0;i<n;i++)
{
    for(j=0;j<n-i-1;j++)
    {
        if(a[j]<a[j+1])
          {
            max=a[j+1];

          }
    }

    int l=mid;
    if(i%2!=0)
      { l--;
         int m=a[l];
         a[i]=max;
         a[str]=m;
      }

}
  for(i=0;i<n;i++)
    { System.out.println(a[i]);
    }

}
}

     




    
    

