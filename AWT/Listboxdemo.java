import java.awt.*;
import java.awt.event.*;

public class Myframe extends Frame implements ItemListener {

List l;
Choice c;
TextArea ta;


Myframe() {

super("Listbox demo");
l = new List(4,true);
c = new Choice();
ta  =  new TextArea(20,30);
l.add("Monday");
l.add("Tuesday");
l.add("Wednesday");
l.add("Thursday");
l.add("Friday");
l.add("Saturday");
l.add("Sunday");

c.add("January");
c.add("February");
c.add("March");
c.add("April");
c.add("May");


setLayout(new FlowLayout());
add(l);
add(c);
add(ta);

l.addItemListener(this);
c.addItemListener(this);

}

@Override 
public void itemStateChanged(ItemEvent r) {
	
	if(r.getSource()==l)
	ta.setText(l.getSelectedItem());	
	else 
	ta.setText(c.getSelectedItem());
}



}

public class Listboxdemo {

public static void main(String args[]) {

Myframe f = new Myframe();
f.setSize(500,500);
f.setVisible(true);

}

}