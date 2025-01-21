import java.util.*;

class Mythread extends Thread {




public void run() {
	
	int count = 1;
	while(true) {
		
		System.out.println(count++);
		
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		
		
	}
}


}

public class ThreadTest {

public static void main(String args[])throws Exception {

Mythread t = new Mythread("My thread 1");
t.start();



}

}