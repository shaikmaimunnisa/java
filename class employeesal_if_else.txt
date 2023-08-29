class employeesal_if_else
{
public static void main(String[] args)
{
int bsal=25000,pf,tax,grosssal;
double ta,da,hra;
ta=15/100.0*bsal;
da=12/100.0*bsal;
hra=19/100.0*bsal;
int total=(int)(ta+da+hra);
if(total>=40000)
{
pf=(int)(11/100*bsal);
tax=(int)(5/100*bsal);
}
else
{
pf=(int)(7/100*bsal);
tax=(int)(2/100*bsal);
}
grosssal=total-pf-tax;
System.out.println("grosssal:"+grosssal);
}
}


