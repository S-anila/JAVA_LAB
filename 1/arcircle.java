import java.util.Scanner;
class circle
{
    double area(double r)
    {
        return(3.14*r*r);
    }
    double perimeter(double r)
    {
        return(2*3.148*r);
    }
}
class arcircle
{
    public static void main(String args[])
    {
        double radius,a,p;
        Scanner sc= new Scanner(System.in);
         System.out.println("enter the  radius");
         radius=sc.nextDouble();
         circle ob1=new circle();
         a=ob1.area(radius);
         p=ob1.perimeter(radius);
          System.out.println("area of circle"+a);
          System.out.println("perimeter of circle"+p);

}
}