import java.io.*;
class mirror
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size");
        int n=Integer.parseInt(br.readLine());
        int ar[][]=new int[n][n];int i,j;
        for( i=0;i<n;i++)
        { for( j=0;j<n;j++)
             ar[i][j]=Integer.parseInt(br.readLine());}
             System.out.println("Original matrix");
              for( i=0;i<n;i++)
        { for( j=0;j<n;j++)
            System.out.print(ar[i][j]+" ");
            System.out.println();        }
            for(i=0;i<n;i++)
            { for(j=n-1;j>=0;j--)
                System.out.print(ar[i][j]+" ");
                System.out.println();
            }
        }
    }
            
        