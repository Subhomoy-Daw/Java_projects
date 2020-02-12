public class array_neg_pos
{
   void main()
   {
       int[] A={4,-3,9,12,-7,5,8,-11};
       int size=A.length;
       int B[]=new int[size];
       int i,j,k=0;
       
       for(i=0;i<size;i++)
       {
           if(A[i]>=0)
           {
               B[k]=A[i];
               k++;
           }
       }
      
       
       for(i=0;i<size;i++)
       {
           if(A[i]<0)
           {
               B[k]=A[i];
               k++;
           }
       }
       for(i=0;i<size-1;i++)
       {
         System.out.print(" "+A[i]);
         A[i]=B[i];
       }
       System.out.println();
       for(i=0;i<size-1;i++)
       {
         System.out.print(" "+A[i]);
       }
    }
}