class array_series
{
    void main()
    {
        int i[]={1,2,3,4,5,6,7,8,9,10};
        int k[]= new int[10];
        int j,sum=0,l;
        for(j=0;j<10;j++)
        {
            sum=sum+i[j];
            k[j]=sum;
             }
             for(l=0;l<10;l++)
             {
                System.out.println("    "+k[l]);
                }
    }
}