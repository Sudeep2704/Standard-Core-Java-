import java.awt.*;
import java.awt.event.*;

public class Myframe extends Frame {

TextArea ta;
TextField tf;
Label l;
Button b;



Myframe() {


super("Text area Demo");
l = new Label("          ");
ta = new TextArea(10,30);
tf = new TextField(20);
b = new Button("click");
setLayout(new FlowLayout());
add(ta);
add(l);
add(tf);
add(b);

}


}


public class textfielddemo {

public static void main(String args[]) {

Myframe f  = new Myframe();
f.setSize(500,500);
f.setVisible(true);

}


}