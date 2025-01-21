import java.awt.*;
import java.awt.event.*;


class Myframe extends Frame implements ItemListener {


Label l;
Checkbox c1, c2, c3;
CheckboxGroup cbg;

public Myframe() {
super("check box Demo");

l  = new Label("    Nothing to be displayed    ");
c1 = new Checkbox("java", false, cbg);
c2 = new Checkbox("python", false, cbg);
c3 = new Checkbox("c", false, cbg);

c1.addItemListener(this);
c2.addItemListener(this);
c3.addItemListener(this);

setLayout(new FlowLayout());

add(l);
add(c1);
add(c2);
add(c3);



}

@Override
public void itemStateChanged(ItemEvent e) {
	String str = "";
	if(c1.getState())
	str = str + " " + c1.getLabel();
	if(c2.getState())
	str = str + " " + c2.getLabel();
	if(c3.getState())
	str = str + " " + c3.getLabel();
	if(str.isEmpty())
		str = " Nothing is selected  ";


}

}

public class Checkdemo {

public static void main(String args[]) {


Myframe f = new Myframe();
f.setSize(400,400);
f.setVisible(true);

}


}