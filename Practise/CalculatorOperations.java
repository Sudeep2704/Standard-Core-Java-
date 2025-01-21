import java.util.*;


public class CalculatorOperations {

public static void main(String args[]) {

System.out.println("Calculator");
System.out.println("Enter two numbers to perform operations, select from the options:");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
System.out.println("5. Square of multiply");
Scanner sc = new Scanner(System.in);
int operations = sc.nextInt();

System.out.println("Enter two numbers");
float x = sc.nextFloat();
float y = sc.nextFloat();


switch(operations) {

case 1 : 

System.out.println("Addition value is :" +(x+y));
break;

case 2 :

System.out.println("Subtraction value is :" +(x-y));
break;

case 3 :

System.out.println("Multiplication value is :" +(x*y));
break;

case 4 :

System.out.println("Division value is :" +(x/y));
break;

case 5 :
float mul = x * y;
System.out.println("Multiplication is : " +(mul*mul));
break;


default : 

System.out.println("Enter correct input");

}



}
}