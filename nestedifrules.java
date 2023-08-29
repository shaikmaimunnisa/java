class nestedifrules
{
public static void main(String []args)
{
if(true)
{
System.out.println("i am in outer if");
  if(true)
  {
    System.out.println("i am in inner if");
  }
}
else
{
System.out.println(" i am in else outer if");
  if(true)
  {
     System.out.println(" i am in else inside if");
  }
}
}
}  