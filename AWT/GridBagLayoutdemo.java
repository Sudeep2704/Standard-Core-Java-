import java.awt.*;
import java.awt.event.*;


public class Myframe extends Frame {


Button b1,b2,b3,b4,b5,b6;


Myframe() {

super("gridbag layout demo");

GridBagLayout gb = new GridBagLayout();
GridBagConstraints gbc  = new GridBagConstraints();


b1 = new Button("one");
b2 = new Button("two");
b3 = new Button("three");
b4 = new Button("four");
b5 = new Button("five");
b6 = new Button("six");

setLayout(gb);
gbc.gridx = 1;
gbc.gridy = 1;

add(b1, gbc);

gbc.gridx = 2;
gbc.gridy = 2;

add(b2, gbc);

gbc.gridx = 3;
gbc.gridy = 3;

add(b3, gbc);

gbc.gridx = 4;
gbc.gridy = 4;

add(b4, gbc);

gbc.gridx = 5;
gbc.gridy = 5;

add(b5, gbc);

gbc.gridx = 6;
gbc.gridy = 6;

add(b6, gbc);
}

}

public class GridBagLayoutdemo {

public static void main(String args[]) {

Myframe f = new Myframe();
f.setSize(400,400);
f.setVisible(true);

}




}