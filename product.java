class product
{
  public static void main(String []args)
  {
    String name="exyz";
    int code=2324;
    int price=133;
    int quantity=3;
    int total=price*quantity;
    double discount;
    discount=11.0/100*total;
    double finalamount=total-discount;
    double gst=12.0/100*finalamount;
    double   addgst=finalamount+gst;
    System.out.println("addgst:"+addgst);
    System.out.println("total:"+total);
    System.out.println("discount:"+discount);
    
  }
}
