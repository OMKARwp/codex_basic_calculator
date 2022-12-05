import java.util.*;
public class basiccalc3
{
   public static void main(String[] args)
   {
      double a, b, res;
      int choice;
      Scanner s = new Scanner(System.in);
      
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Modulus");
      System.out.println("enter your choice");
      choice = s.nextInt();
      if(choice>=1 && choice<=5)
      {
         System.out.print("Enter 2 Number: ");
         a = s.nextDouble();
         b =s.nextDouble();
         if(choice==1)
            res = a+b;
         else if(choice==2)
            res = a-b;
         else if(choice==3)
            res = a*b;
         else if (choice==4)
            res = a/b;
         else
        	 res = a%b;
         System.out.println("result=" +res);
      }
      else
         System.out.println("invalid choice");
   } 
}