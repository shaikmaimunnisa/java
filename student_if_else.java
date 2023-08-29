class student_if_else
{
public static void main(String []args)
{
int s1=45,s2=66,s3=76,s4=89,s5=99,s6=77,fee=75000;
int scholarship,donation;
char sec;
int total=s1+s2+s3+s4+s5+s5+s6;
double percentage ;
percentage=total/600.0*100;
if(percentage>80)
{
sec='A';
scholarship=10000;
donation=0;
}
else
{
sec='b';
scholarship=0;
donation=1000;
}
int feetotal=fee+donation+scholarship;
System.out.println("sec:"+sec+"\n"+"scholarship:"+scholarship+"\n"+"donation:"+donation);
}
}
