package project;

import java.io.*;
class bubble
{
public  void main1()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int j,t,n,i;
System.out.println("Enter no.of elements into the Array:");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];

for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
for(j=0;j<n-i-1;j++)
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
for(i=0;i<n;i++)
System.out.println(a[i]);
}
}


