import java.awt.*;
import java.awt.event.*;


public class Myframe extends Frame implements WindowListener {

Label l;

Myframe() {

super("  Window event demo  ");

l = new Label("               ");
setLayout(new FlowLayout());
add(l);
addWindowListener(this);

}

@Override
public void windowActivated(WindowEvent e) {
	
	
	
}


@Override
public void windowClosed(WindowEvent e) {
	
	l.setText("window closed");
	
}

@Override
public void windowClosing(WindowEvent e) {
	
	l.setText("window closing");
	System.exit(0);
}


@Override
public void windowDeactivated(WindowEvent e) {
	
	
	
}

@Override
public void windowDeiconified(WindowEvent e) {
	
	
	
}


@Override
public void windowIconified(WindowEvent e) {
	
	
	
}

@Override
public void windowOpened(WindowEvent e) {
	
	
	
}




}

public class WindowEventdemo {

public static void main(String args []) {

Myframe f = new Myframe();
f.setSize(500,500);
f.setVisible(true);
}


}