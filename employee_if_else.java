class employee_if_else
{
public static void main(String[] args)
{
int bsal=25000;
double pf,tax;
double ta,hra,da,grosssalary;
ta=15/100.0*bsal;
hra=19/100.0*bsal;
da=12/100.0*bsal;
double totalsal=bsal+ta+hra+da;
if(totalsal>40000)
{
pf=11/100.0*bsal;
tax=5/100.0*bsal;
}
else
{
pf=7/100.0*bsal;
tax=25/100.0*bsal;
}
grosssalary=(double)(totalsal-tax-pf);
System.out.println("grosssalary:"+grosssalary);
}
}
