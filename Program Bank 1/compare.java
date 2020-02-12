class compare
{
    void main()
    {
        int i[]={1,2,3,4,5,6,7,8,9,10};
        int j,max,min;
        max=i[0];
        min=i[0];
        for(j=0;j<10;j++)
        {
            if(i[j]>max)
            max=i[j];
            if(i[j]<min)
            min=i[j];
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}
        