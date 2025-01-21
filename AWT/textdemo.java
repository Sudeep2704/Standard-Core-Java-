import java.awt.*;
import java.awt.event.*;


public class Myframe extends Frame implements TextListener, ActionListener{

Label l1, l2;
TextField tf;

Myframe() {

super("Text Field Demo");


l1 = new Label("No text is input");
l2 = new Label("Enter is not hit yet");
tf = new TextField(20);

tf.addTextListener(this);
tf.addActionListener(this);

setLayout(new FlowLayout());
add(l1);
add(tf);
add(l2);
}

@Override 
public void textValueChanged(TextEvent e) {
	
	l1.setText(tf.getText());
}

public void actionPerformed(ActionEvent e) {
	
	l2.setText(tf.getText());
}


}


public class textdemo {

public static void main(String args[]) {

Myframe f = new Myframe();
f.setSize(400,400);
f.setVisible(true);
}



}