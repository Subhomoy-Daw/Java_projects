class armstrong
{
    void main(int num)
    {
        int r=0,i,digit=0,sum=0;
        for(i=num;i>0;i=i/10)
        {
            r=i%10;
            digit = (r*r*r);
            sum=sum+digit;
        }
        
        if(sum==num)
        System.out.println("armstrong");
        else
        System.out.println("not armstrong");
    }
}