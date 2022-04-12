import java.util.Scanner;
 class sum
{
int a,b,r;
void calc()
{
r=a+b;
}
void display()
{
System.out.println(r);
}
}
 class sum1
{
public static void main(String args[])
{
sum s1=new sum();
sum s2=new sum();
s1.a=10;
s2.b=20;
 s1.calc();
 s1.display();
System.out.println("object s1 is");
s2.calc();
s2.display();
System.out.println("object s2 is");
}
}






