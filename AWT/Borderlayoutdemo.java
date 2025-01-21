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


add(b1, BorderLayout.NORTH);
add(b2, BorderLayout.SOUTH);
add(b3, BorderLayout.EAST);
add(b4, BorderLayout.WEST);
add(b5, BorderLayout.CENTER);


Panel p = new Panel();
p.setLayout(new GridLayout(3,1));
p.add(new Button("mon"));
p.add(new Button("Tue"));
p.add(new Button("Wed"));
add(p.BorderLayout.EAST);
}




}

public class Borderlayoutdemo {

public static void main(String args[]) {

Myframe f = new Myframe();
f.setSize(500, 500);
f.setVisible(true);
}


}