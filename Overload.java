class Shape
{
    void area(float x)
    {
        System.out.println("Area of the square is "+x*x+" sq cm");
    }
    void area(float x, float y)
    {
        System.out.println("Area of the rectangle is "+x*y+" sq cm");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("Area of the circle is "+z+" sq cm");
    }
void area(float x,float y)
{
float  z=0.5*x*y;
System.out.println("Area of the triangle is "+z+" sq cm");
}

}
class Overload 
{
     public static void main(String args[]) 
	{
	   Shape ob = new Shape();
	   ob.area(4);
	   ob.area(9,11);
	   ob.area(4.6);
ob.area(3.6);
        }
}