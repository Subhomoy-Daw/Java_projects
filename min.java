class min
{
    void main(int i,int j,int k)
    {
        int min=0;
        if(i<j&&i<k)
        min =i;
        if(j<i&&j<k)
        min=j;
        if(k<i&&k<j)
        min= k;        
        System.out.println(min);
    }
}