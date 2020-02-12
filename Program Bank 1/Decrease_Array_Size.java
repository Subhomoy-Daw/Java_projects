class Decrease_Array_Size
{static int arr[]=new int[5];
    public static void main()
    {
        int a=0, n=10;
        
        
        for(a=0;a<5;a++)
        {
            arr[a]=a+1;
            System.out.print(arr[a]+" ");
        }
        
        arr--;

        for(a=0;a<5;a++)
            System.out.print(arr[a]+" ");
    }
}