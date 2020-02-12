class double_triangle
{
    void main()
    {
        int i,j,k,l,m;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }     
        for(l=2;l<=5;l++)
            {
                for(m=1;m<=l;m++)
                {
                    System.out.print("* ");
                }
           
            System.out.println();
        }
    }
   }
