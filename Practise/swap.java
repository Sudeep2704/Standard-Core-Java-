import java.util.*;


public class swap {

public static void main(String args[]) {


System.out.println("ENTER TWO NUMBERS TO SWAP");

Scanner sc = new Scanner(System.in);

int x = sc.nextInt();
int y = sc.nextInt();

System.out.println("Entered values before swap are : " + (+x) + " " + (+y));

int temp = x;
x=y;
y = temp;

System.out.println("after swapping is :" + (+x) + " " + (+y));


}
}