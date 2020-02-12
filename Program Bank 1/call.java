class call
{
   void main()
   {
    overload_13 o1=new overload_13();
    o1.series(5);
    o1.series(2,5);
    System.out.println("sum = "+o1.series(5));
     System.out.println("sum = "+o1.series(2,5));
   }
}