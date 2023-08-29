class bytetochar
{
public static void main(String args[])
{
byte b=97;
char c=(char)b;//c=b//c=97//97 is a integer number, char is a 2bytes only //error:incompatible datatype
System.out.println("c:"+c);
}
}