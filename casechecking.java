-class casechecking
{
public Static void main(String[] args)
{
  char ch='a';
  if(Character.isUpperCase(ch))
  {
    System.out.println(Character.toLowerCase(ch));
  }
  else if(Character.isLowerCase(ch))
  {
    System.out.println(Character.toUpperCase(ch));
  }
  else
  {
    System.out.println(" incorrect information");
  }
}
}
