import java.io.*;
class surname
{
    public static void main(String s)
    {
        String w="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
              //System.out.print(w);  
              System.out.print(w.charAt(0));
              System.out.print(".");
              w="";
            }
                else
                w=w+s.charAt(i);
            }
                System.out.print(w);
            
        }
    }
