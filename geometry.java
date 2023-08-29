class geometry
{
  public static void main(String[] args)
  {
    int length=4,breadth=23,radius=4;
    int area=length+breadth;
    int perimeter;
    perimeter=2*length*breadth;
    System.out.println("perimeter:"+perimeter);
    double pi=Math.PI;
    double circlearea=pi*Math.pow(radius,2);
    double circumference=2*pi*radius;
    System.out.println("circlearea:"+circlearea);
    System.out.println("circumference:"+circumference);
  }
}
