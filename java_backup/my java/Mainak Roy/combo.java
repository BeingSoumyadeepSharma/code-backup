import java.util.*;
public class combo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no.?");
int n=sc.nextInt();
String w=Integer.toString(n);
System.out.println("odd combinations");
for(int i=0;i<w.length();i++)
{
String m="";
m=m+w.charAt(i);
int g=Integer.parseInt(m);
if(g%2!=0)
System.out.println(g);
}

for(int i=0;i<w.length();i++)
{
for(int j=0;j<w.length();j++)
{
String w1="";
w1=w1+w.charAt(i);
if(i==j)
continue;
w1=w1+w.charAt(j);
int o=Integer.parseInt(w1);
if(o%2!=0)
System.out.println(o);
}
}
System.out.println("even combinations");
for(int i=0;i<w.length();i++)
{
String m="";
m=m+w.charAt(i);
int g=Integer.parseInt(m);
if(g%2==0)
System.out.println(g);
}
for(int i=0;i<w.length();i++)
{
for(int j=0;j<w.length();j++)
{
String w2="";
w2=w2+w.charAt(i);
if(i==j)
continue;
w2=w2+w.charAt(j);
int p=Integer.parseInt(w2);
if(p%2==0)
System.out.println(p);
}
}
}
}