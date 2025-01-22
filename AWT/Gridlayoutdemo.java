import java.awt.*;
import java.awt.event.*;


public class Myframe extends Frame {


Button b1,b2,b3,b4,b5,b6;


Myframe() {

b1 = new Button("one");
b2 = new Button("two");
b3 = new Button("three");
b4 = new Button("four");
b5 = new Button("five");
b6 = new Button("six");

setLayout(new GridLayout(3,2));

add(b1);
add(b2);
add(b3);
add(b4);
add(b5);


}

}

public class Gridlayoutdemo {

public static void main(String args[]) {

Myframe f = new Myframe();
f.setSize(400,400);
f.setVisible(true);

}




}