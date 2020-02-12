class emp extends Person
{
    String empid; 
    
    emp(String name,String address,double salary,String empid)
    {
      super(name,address,salary);
      this.empid=empid;
    }
    public void input(String n,String a,double s,String e)
   {
       name = n;
       address = a;
       salary = s;
       empid = e;
   }
    void show()
    {
       System.out.println("id = "+this.empid);
       System.out.println("Name = "+name);
       System.out.println("Address = "+address);
       System.out.println("Salary = "+salary);
    }
}
