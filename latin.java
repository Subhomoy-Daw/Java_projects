import java.io.*;
import java.lang.*;
class latin
{
    void main()
    {
        int i,j;
        String k;
        String l = "";
        char a;
        k="London";
        k=k.toUpperCase();
        i=k.length();
        for(j=0;j<i;j++)
        {
            a=k.charAt(j);
            if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
            {
               l=k.substring(j)+k.substring(0,j)+"AY";
               break;
            }
        }
        System.out.print(l);
    }
}