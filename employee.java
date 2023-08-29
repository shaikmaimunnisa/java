claass employee
{
  public static void main(String []args)
  {
    String empname="mahi";
    int basicsal=15000,tax=56,pf=45;
    double ta,da,hra;
    ta=10/100*basicsal; 
    da=15/100*basicsal;
    hra=11/100*basicsal;
    double specialallowance=ta+da=hra;
    double grosssal=basicsal+specialallowance;
    double monthlysal=grosssal-tax-pf;
    System.out.println("specialallowance: "+specialallowance);
    System.out.println ("monthlysal:"+monthlysal);
  }
}

