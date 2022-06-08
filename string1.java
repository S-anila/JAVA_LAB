
import java.util.Scanner;
public class string1
{
	public static void main(String args[]){
	String s1,s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string1 : ");
	s1=sc.next();
	System.out.println("Enter string2 : ");
	s2=sc.next();
	System.out.println(s1.toUpperCase());
	System.out.println( s1.toLowerCase());
	System.out.println( s1.substring(2,5));
	System.out.println( s1.length());
	System.out.println(s1.concat(s2));
	System.out.println(s1.compareTo(s2));
	System.out.println( s1.equals(s2));
	System.out.println(s1.charAt(0));
	
}
}