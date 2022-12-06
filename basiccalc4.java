            import java.util.*;
            public class basiccalc4 
            {
            public static void main(String[] args)
            {
            Scanner s= new Scanner(System.in);
            int option;
            double num1, num2, result;
            result = 0;
            do 
            {
            System.out.println("|| M A I N  M E N U");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Multiply");
            System.out.println("4: Divide");
            System.out.println("5: Modulus");
            System.out.println("6: Continue");
            System.out.println("7: Exit");
            option = s.nextInt();
            switch (option){
            case 1: {
            System.out.println("Enter FIRST Number");
                num1 = s.nextDouble();
                System.out.println(" Enter  SECOND Number");
                num2 = s.nextDouble();
                result = num1 + num2;
                System.out.println("result= "+result);
                break;
            }
            case 2: {
                System.out.println("Enter  FIRST Number");
                num1 = s.nextDouble();
                System.out.println("Enter SECOND Number");
                num2 = s.nextDouble();
                result = num1 - num2;
                System.out.println("result= "+result);
                break;
            }
            case 3: {
                System.out.println("Enter  FIRST Number");
                num1 = s.nextDouble();
                System.out.println("Enter SECOND Number");
                num2 = s.nextDouble();
                result = num1 * num2;
                System.out.println("result= "+result);
                break;
            }
            case 4: {
                System.out.println("Enter  FIRST Number");
                num1 = s.nextDouble();
                System.out.println("Enter SECOND Number");
                num2 = s.nextDouble();
                result = num1 / num2;
                System.out.println("result= "+result);
                break;
            }
            case 5: {
                System.out.println("Enter  FIRST Number");
                num1 = s.nextDouble();
                System.out.println("Enter SECOND Number");
                num2 = s.nextDouble();
                result = num1 % num2;
                System.out.println("result= "+result);
                break;
            }
            case 6: {
                System.out.println("Choose an option");
                System.out.println("1: Add");
                System.out.println("2: Subtract");
                System.out.println("3: Multiply");
                System.out.println("4: Divide");
                System.out.println("5: Modulus");
                System.out.println("Option");
                option = s.nextInt();
                switch (option){
                case 1: {
                    System.out.println("Enter Second Number");
                    num2 = s.nextDouble();
                    result = result + num2;
                    System.out.println("result= "+result);
                    break;
                }
                case 2: {
                    System.out.println("Enter Second Number");
                    num2 = s.nextDouble();
                    result = result - num2;
                    System.out.println("result= "+result);
                    break;
                }
                case 3: {
                    System.out.println("Enter Second Number");
                    num2 = s.nextDouble();
                    result = result * num2;
                    System.out.println("result= "+result);
                    break;
                }
                case 4: {
                    System.out.println("Enter Second Number");
                    num2 = s.nextDouble();
                    result = result / num2;
                    System.out.println("result= "+result);
                    break;
                }
                case 5: {
                    System.out.println("Enter Second Number");
                    num2 = s.nextDouble();
                    result = result % num2;
                    System.out.println("result= "+result);
                    break;
                }
                }
                break;
            }
            default: {
                System.out.println("Program will now exit ");
                System.exit(0);
            }
            }
        } while (option !=6); }
}           