class divisable_swapin_if
{
public static void main(String []args)
{
int a=10,b=5;
if(a%b==0)
{
a=a+b;
b=a-b;
a=a-b;
}
System.out.println("a:"+a);
System.out.println("b:"+b);
}
}