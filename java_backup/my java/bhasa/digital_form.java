import java.io.*;
class digital_form
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char a[][]=new char[5][5];
int k,i,j,p,s,m,t;
System.out.println("ENTER NUMBER");
int n=Integer.parseInt(br.readLine());
m=n;
s=0;t=0;
while(m>0)
{
t=m%10;
s=(s*10)+t;
m=m/10;
}

while(s>0)
{
k=s%10;
switch(k)
{
case 0:
System.out.println("|----|");
System.out.println("|    |");
System.out.println("|    |");
System.out.println("|    |");
System.out.println("|----|");
System.out.println("      ");
break;
case 1:
System.out.println("---   ");
System.out.println("  |   ");
System.out.println("  |   ");
System.out.println("  |   ");
System.out.println("------");
System.out.println("      ");
break;
case 2:
System.out.println("-----|");
System.out.println("     |");
System.out.println("|----|");
System.out.println("|     ");
System.out.println("|-----");
System.out.println("      ");
break;
case 3:
System.out.println("-----|");
System.out.println("     |");
System.out.println("-----|");
System.out.println("     |");
System.out.println("-----|");
System.out.println("      ");
break;
case 4:
System.out.println("|    |");
System.out.println("|    |");
System.out.println("|____|");
System.out.println("     |");
System.out.println("     |");
System.out.println("      ");
break;
case 5:
System.out.println("|-----");
System.out.println("|     ");
System.out.println("|----|");
System.out.println("     |");
System.out.println("-----|");
System.out.println("      ");
break;
case 6:
System.out.println("|----");
System.out.println("|     ");
System.out.println("|----|");
System.out.println("|    |");
System.out.println("|----|");
System.out.println("      ");
break;
case 7:
System.out.println("-----/");
System.out.println("    /");
System.out.println("   /");
System.out.println("  /");
System.out.println(" /");
System.out.println("      ");
break;
case 8:
System.out.println("|----|");
System.out.println("|    |");
System.out.println("|----|");
System.out.println("|    |");
System.out.println("|----|");
System.out.println("      ");
break;
case 9:
System.out.println("|----|");
System.out.println("|    |");
System.out.println("|----|");
System.out.println("     |");
System.out.println("|----|");
System.out.println("      ");
break;
default:
System.out.println("ERROR");
}
s=s/10;
}
while(n%10==0)
{
System.out.println("|----|");
System.out.println("|    |");
System.out.println("|    |");
System.out.println("|    |");
System.out.println("|----|");
System.out.println("      ");
n=n/10;
}
}
}