import java.io.*;
class change_case
{
    void main()throws IOException
    {
        String s="",n="";
        char c,d;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter String");
        s=br.readLine();
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>='A'&&c<='Z')
            {
                n+=Character.toLowerCase(c);

            }
            if(c>='a'&&c<='z')
            {
                n+=Character.toUpperCase(c);
                
            }
        }
        System.out.println("The old string was "+s);
        System.out.println("The new sting is "+n);
    }
}

        