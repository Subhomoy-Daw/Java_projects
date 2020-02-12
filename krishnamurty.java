public class krishnamurty
{
   void main(int num)
   {
       int i,j,rem=0,res=0;
       int sum=0,x=num,fact=1;
       while(x>0)
       {
           rem = x%10;
           for(i=1;i<=rem;i++)
           {
               fact = fact * i;
           }
           sum = sum + fact;
           fact = 1;
           x = x/10;
       }
       if(sum==num)
         System.out.println("It is krishnamurty no..");
       else
         System.out.println("Not a krihsmurty no..");
   }
}