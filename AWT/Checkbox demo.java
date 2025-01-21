import java.awt.*;
import java.awt.event.*;


class Myframe extends Frame {


Label l;
checkbox c1, c2, c3;

public Myframe() {
super("check box Demo");

l  = newLabel("                ");
c1 = new checkbox("java");
c2 = new checkbox("python");
c3 = new checkbox("c");

setLayout(new FlowLayout());

add(l);
add(c1);
add(c2);
add(c3);





}

}

public class Checkdemo {

public static void main(String args[]) {


Myframe f = new Myframe();
f.setSize(400,400);
f.setVisible(true);

}


}