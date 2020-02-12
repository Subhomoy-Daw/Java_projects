import java.lang.*;
class calculate_string
{
    void main(String s)
    {
        char c;
        int j=0,k=0,l=0,i;
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>='a'&&c<='z')
            {
                j++;
            }
            if(c>='A'&&c<='Z')
            {
                k++;
            }
            if(c==' ')
            {
                l++;
            }
        }
        System.out.println("No of capital letters = "+k);
        System.out.println("No of small letters = "+j);
        System.out.println("No of blank spaces = "+l);
    }
}