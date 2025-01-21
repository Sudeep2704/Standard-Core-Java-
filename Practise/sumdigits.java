import java.util.*;


public class sumdigits {

public static void main(String args[]) {


System.out.println("ENTER NUMBER");

Scanner sc = new Scanner(System.in);

int x = sc.nextInt();


String numInt = String.valueOf(x);
char d = numInt.charAt(0);
char i = numInt.charAt(1);

int a = Character.getNumericValue(d);
 int b = Character.getNumericValue(i);


System.out.println("digits are" + (d) + "and" + (i));
System.out.println(a+b);




}
}