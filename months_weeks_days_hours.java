class months_weeks_days_hours
{
public static void main(String []args)
{ 
int presentyear=2023;
int dateofbirth=1998;
int age=presentyear-dateofbirth;
System.out.println("age:"+age);
int months=age*12;//1year=12months
int weeks=months*7;//weeks=7days
int days=age*365;//1year=365days
int hours=days*60;
System.out.println("months:"+months);
System.out.println("weeks:"+weeks);
System.out.println("days:"+days);
System.out.println("hours:"+hours);
}
}