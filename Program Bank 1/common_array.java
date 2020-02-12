class common_array
{
    void main()
    {
        int a[]={5,7,4,3,12};
        int b[]={7,5,12,14};
        
        int len=a.length;
        int len1=b.length;
        int len3=0,k=0;
        
        if(len<len1)
          len3=len;
        else
          len3=len1;
          
        int[] c=new int[len3];
        int co=0;

        for(int i=0;i<len;i++)
        {
            co=a[i];
            for(int j=0;j<len1;j++)
            {
                if(co==b[j])
                {
                  //System.out.print(" "+co);
                  c[k]=co;
                  k++;
                }
            }
        }
        
        for(int i=0;i<k && c[i]!=0;i++)
        {
            System.out.print(" "+c[i]);
        }
            
    }
}