class linear
{
 void main( int n)
 {
     int a[]={5,3,8,4,9,2,1,12,90,15};
     int flag=0,i=0;
     for (i=0;i<a.length;i++)
    { 
        if(n==a[i])
         { flag=1;
           break;
        }
     }
     if (flag==1)
        System.out.println("Element present at position"+""+(i+1));
     else
        System.out.println("Element not present");
    }
}
        