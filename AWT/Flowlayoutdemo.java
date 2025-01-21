import java.awt.*;
import java.awt.event.*;


public class Myframe extends Frame {

Button b1, b2, b3, b4, b5, b6;

Myframe() {

super("flow layout demo");

b1 = new Button("one");
b2 = new Button("two");
b3 = new Button("three");
b4 = new Button("four");
b5 = new Button("five");
b6 = new Button("six");

FlowLayout fl = new FlowLayout(); 
fl.setAlignment(FlowLayout.RIGHT);
setLayout(fl);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);


}




}

public class Flowlayoutdemo {

public static void main(String args[]) {

Myframe f = new Myframe();
f.setSize(500, 500);
f.setVisible(true);
}


}