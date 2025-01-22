import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Myframe extends Frame implements KeyListener {


Label l1,l2,l3,l4;


public Myframe() {

super("KeyEvent Demo");

l1 = new Label("");
l2 = new Label("");
l3 = new Label("");
l4 = new Label("");


setLayout(null);

l1.setBounds(30,50,100,20);
l2.setBounds(30,100,100,20);
l3.setBounds(30,150,100,20);
l4.setBounds(30,200,200,20);


add(l1);
add(l2);
add(l3);
add(l4);
addKeyListener(this);

}


@Override
public void keyPressed(KeyEvent e) {

l1.setText("Key Pressed");
l2.setText("");


}
@Override
public void keyReleased(KeyEvent e) {

l2.setText("Key Released");
l1.setText("");
l3.setText("");
l4.setText("");


}
@Override
public void keyTyped(KeyEvent e) {

l3.setText("Key Typed");
l4.setText(new Date(e.getWhen())+"");

}





}

public class KeyEventdemo {

public static void main(String args[]) {

Myframe f = new Myframe();
f.setSize(500,500);
f.setVisible(true);

}




}