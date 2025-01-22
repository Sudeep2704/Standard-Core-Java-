import java.awt.*;
import java.awt.event.*;


public class Myframe extends Frame implements MouseListener {

Label l1;

public Myframe() {

super("Mouse Event demo");
l1 = new Label("");
add(l1);
setLayout(null);

l1.setBounds(30,50,100,20);

addMouseListener(this);
}

@Override 
public void mouseEntered(MouseEvent e) {
	
	l1.setText("Mouse has entered");
}

@Override
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse has exited");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse released");
    }



}

public class MouseEventdemo {

public static void main(String args[]) {


Myframe f = new Myframe();
f.setSize(500,500);
f.setVisible(true);


}



}