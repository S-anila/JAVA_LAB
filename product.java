import java.util.Scanner;
class pdt
{
	int pcode,price;
	String pname;
	
}

class product
{
	public static void main(String srgs[])
	{
	Scanner sc=new Scanner(System.in);
	pdt p=new pdt();
	pdt q=new pdt();
 	pdt r=new pdt();
                  System.out.println("enter the 1st product details:");
	System.out.println("enter pcode ");
                  p.pcode=sc.nextInt();
                  System.out.println("enter pname");
                  p.pname=sc.next();
                  System.out.println("enter price");
                  p.price=sc.nextInt();
	
                  System.out.println("enter the 2nd product details:");
	System.out.println("enter pcode ");
                  q.price=sc.nextInt();
                  System.out.println("enter pname");
                  q.pname=sc.next();
                  System.out.println("enter price");
                  q.price=sc.nextInt();
                   System.out.println("enter the 3rd product details:");
                  System.out.println("enter pcode ");
                  r.pcode=sc.nextInt();
                  System.out.println("enter pname");
                  r.pname=sc.next();
                  System.out.println("enter price");
                  r.price=sc.nextInt();
	

	if(p.price<q.price && p.price<r.price)
		System.out.print(p.pname+" has lowest price");
	else if(q.price<r.price)
		System.out.print(q.pname+" has lowest price");
	else
		System.out.print(r.pname+" has lowest price");
	}

}