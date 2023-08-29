class rootsfindout
{
public static void main(String[] args)
{
int a=10,b=5,c=2;
int x1,x2;
x1=(double)(-b+(Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
System.out.println("x1:"+x1);
x2=(double)(-b-(Math.sqrt(Math.pow(b,2)-4*a*c))/2*a);
System.out.println("x2:"+x2);
}
}