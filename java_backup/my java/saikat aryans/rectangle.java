import java.io.*;
public class rectangle extends add
{
    public static void main()throws IOException
{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int a,b,c,p;
    System.out.println("Enter data");
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    c=a*b;
    p=2*(a+b);
    System.out.println(c+","+p);
}
}
