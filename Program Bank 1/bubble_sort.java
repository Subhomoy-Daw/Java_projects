class bubble_sort
{
    void main(int a[])
    {
        int i,j,k,tmp=0,len=a.length;
        for(i=0;i<len;i++)
        {
            for(j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(k=0;k<a.length;k++)
        {
            System.out.println(" "+a[k]);
        }
    }
}