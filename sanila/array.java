import java.util.Scanner;
public class array
{
public static void main(String args[])
{
int i,count=-1,flag=0;
int array[] = {12,23,34,46};
      int size = array.length;
       int value = 2;
      for ( i=0 ;i< size-1; i++)
      
{
         if(array[i]==value)
          
{
         count++;
          flag=1;
}
}
          if(flag==1)
            System.out.println("Element found  in :"+ count);
        else
{
            System.out.println("Element not found");
 }
 }
 }

