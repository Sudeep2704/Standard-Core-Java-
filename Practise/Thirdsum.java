import java.util.*;


public class Thirdsum {
public static void main(String args[]) {

System.out.println("ENTER THREE NUMBERS");
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();

int y = sc.nextInt();

int z = sc.nextInt();


int sum = x + y;

if(sum==z) {

System.out.println("The sum of first two integer is equal to the third integer");
System.out.println("Status - True");

}

else {

System.out.println("Status false");

}


}

}