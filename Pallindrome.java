class Pallindrome
{
    void main()
    {
        int a=1;
        int b=0;
        int c=0;
        while (a<=100)
        {
            b=pal(c);
            if (b==1)
            {
                System.out.print(" "+c);
                a++;
            }
            c++;
        }
    }
    int pal (int k)
    {
        int digit=0;
        int b=0;
        for (int i=k;i>0;i=i/10)
        {
            b=i%10;
            digit=digit*10+b;
        }
        if (digit==k)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}