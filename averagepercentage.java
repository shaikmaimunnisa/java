class averagepercentage
{
  public static void main(String[] args)
  {
    int s1=55,s2=56,s3=65,s4=88,s5=99,s6=78;
    int max=100;//each subject maxmarks=100
    double s1_=s1/100.0*100;
    double s2_=s2/100.0*100;
    double s3_=s3/100.0*100;
    double s4_=s4/100.0*100;
    double s5_=s5/100.0*100;
    double s6_=s6/100.0*100;
    double averagepercentage=s1+s2+s3+s4+s5+s6/6;
    System.out.println("averagepercentage:"+averagepercentage);
    int maxmarks=600;//six subjects marks
    int total=s1+s2+s3+s4+s5+s6;
    System.out.println("total:"+total);
    double percentage;
    percentage=total/600.0*100;
    System.out.println("percentage:"+percentage);
  }
}



