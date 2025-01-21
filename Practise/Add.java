import java.util.*;


public class Add {

public static void main(String args[]) {

int a = 2, b = 3;
System.out.println(a+b);
Scanner scan = new Scanner(System.in);
System.out.println("Input two Numbers");
int x = scan.nextInt();
int y = scan.nextInt();
System.out.println("The user input for" + " " + x + "and" + " " + y + "is" + (x+y));
}
}