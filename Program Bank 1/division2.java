class division2
{
void main()
{
  int a[]={21,8,7,77,36,66,28,63};
  int x= a.length;
  int cn1=0,cn2=0;
  for(int i=0; i<x-1; i++)
  {
      if (a[i]%3==0)
      cn1++;
      if (a[i]%7==0)
      cn2++;
    }
    System.out.println( "divisible by 3="+cn1);
    System.out.println("divisible by 7="+cn2);
}
}
    