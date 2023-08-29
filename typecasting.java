class typecasting
{
public static void main(String args[])
{
byte b=127;
short s=265;
//s=s+b;//s=265+127//error
int x=(int)b+s;
System.out.println("x:"+x);
}
}

