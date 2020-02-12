import java.io.*;
import java.lang.*;
public class bin_to_dec
{
    public static void main()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int n=0,r=0,size=0,i=0,num=0,m=0,k=0;
        System.out.println("Enter any numbers =");
        num = Integer.parseInt(br.readLine());
        
        m=n=num;
        while(n>0)
        {
            n=n/2;
            size++;
        }

        int[] array = new int[size+1];
        
        while(m>0)
        {
            r=m%2;
            m=m/2;
            array[k]=r;
            k++;
        }
        
        System.out.println("After converting to binary==>");
        for(i=size-1;i>=0;i--)
        System.out.print(" "+array[i]);
    }
}
