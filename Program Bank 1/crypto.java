public class crypto
{
public void encrypt(String s)
  {
   int i,len;
   char ch;
   String st="";
   len=s.length();
   for(i=0;i< len;i++)
   {
    ch=s.charAt(i);
    if((ch >=65 && ch<=90)||(ch >=97 && ch<=122))
    {
       ch=(char)(ch+2);
  if(ch >90 && ch< 97)
  {
   ch=(char)((64+ch-90));
   }
  else if(ch >122)
  {
   ch=(char)((96+ch-122));
   }
 }
  st=st+ch;
  }
 System.out.println(st);
 }
}