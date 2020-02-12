import java.io.*;
import java.lang.*;
class palindrome
{
    void main()
    {
        String str = "ajay",reverse="";
        int length = str.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse = reverse+str.charAt(i);       
        }
        System.out.println(reverse);
        if(str.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}