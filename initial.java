 class initial
 {
     void main()
     {
         String s= "Netaji Subhash Chandra Bose";
         int len= s.length();
         String b="";
         b=b+s.charAt(0);
         
         for(int i=0;i<len;i++)
         {
             if(s.charAt(i)==' ')
             {
                 b=b+'.'+s.charAt(i+1);
             }
         }
         System.out.println("The compressed string ="+b);
     }
}