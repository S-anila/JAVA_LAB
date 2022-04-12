import java.util.Scanner;
public class complex
{
    double real,img;
    public  complex(int r,int i)
{
        this.real=r;
        this.img=i;
    }
    public static complex add(complex a,complex b)
{
        complex x=new complex(0,0);
        x.real=a.real+b.real;
        x.img=a.img+b.img;
        return x;
    }
public static void main (String args[])
{
    complex com=new complex(6,5);
    complex com1=new complex(3,5);
    complex x=add(com,com1);
    System.out.println("Sum of the complex number is" + x.real+"+"+x.img+"i");
}
}