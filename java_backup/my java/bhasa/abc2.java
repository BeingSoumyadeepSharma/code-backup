
import java.io.*;
class abc
{
int x;
abc(int y)
{
x=y;
}
void disp()
{
System.out.println(x);
}
}

class abc1 extends abc
{
int y;
abc1(int a,int b)
{
super(a);
y=b;
}
void disp1()
{
disp();
System.out.println(y);
}
}

class abc2 extends abc1
{
int z;
abc2(int a,int b,int c)
{
super(a,b);
z=c;
}
void disp2()
{
disp1();
System.out.println(z);
}
}
