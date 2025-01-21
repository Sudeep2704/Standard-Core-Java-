import java.util.*;


public class Averageofthree {

public static void main(String args[]) {


System.out.println("Enter three numbers to perform average");

Scanner sc = new Scanner(System.in);

float x = sc.nextFloat();
float y = sc.nextFloat();
float z = sc.nextFloat();

float avg = (x+y+z) / 3;
System.out.println("average is : " +avg);


}
}