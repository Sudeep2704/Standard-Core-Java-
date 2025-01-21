import java.util.*;

class Mythread extends Thread {


public void run() {

int i = 1;
while(true) {

System.out.println(i + "Hello");
i++;
}
}
}

class Test {

public static void main(String args[]) {

Mythread t = new Mythread();
t.start();
int i = 1;

while(true) {

System.out.println( i + "world");
i++;
}
}

}