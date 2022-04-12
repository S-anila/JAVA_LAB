public class string {
  public static void main(String[] args)
 {
    String greeting = "Hello";
    String txt = "sana";
    System.out.println(greeting);
    System.out.println("The length of the txt string is: " + greeting.length());
    System.out.println(greeting.toUpperCase());
    System.out.println(greeting.toLowerCase());
    System.out.println(greeting.indexOf("e"));
    System.out.println(greeting + " " + txt);
    String[] result = greeting.split(" ");
    System.out.print(" ");
    for (String str : result) 
{
      System.out.println(str + ", ");
  }
}
}