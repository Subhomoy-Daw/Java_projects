import java.io.*;
import java.lang.*;
class alphabets
{
    void main(int x)
    {
        int i,j,k;
        for(i=1;i<=x;i++)
        {
            k= 96;
            for(j=1;j<=x;j++)
            {
                if(i+j>=x+2)
                {
                    System.out.print(" ");
                }
                else
                {
                    k=k+1;
                    System.out.print((char)k);
                }
            }
            for(j=x-1;j>=1;j--)
            {
                if(i+j>=x+2)
                System.out.print(" ");
                else
                {
                    System.out.print((char)k);
                    k=k-1;
                }
            }
            System.out.println();
        }
    }
}