class con_even
{
 void main()
 {
     int a[]={5,3,8,4,9,2,1,12,90,15};
     int i=0,p=0,q=0;
     int len = a.length;
     for(i=0;i<len-1;i++)
     {
         p=is_even(a[i]);
         q=is_even(a[i+1]);
         if(p==0 && q==0)
         {
             System.out.print("["+a[i]+","+a[i+1]+"]");
             System.out.println();
         }
     }
 }
 int is_even(int x)
 {
     if(x%2==0)
       return 0;
     else
       return 1;
 }
}