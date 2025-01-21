import java.awt.*;

public class Testawt {

public static void main(String args[]) {

Frame f = new Frame("My App");
f.setLayout(new FlowLayout());
Button b = new Button("ok");
Label lb = new Label("Name");

TextField tf = new TextField(20);


f.add(lb);
f.add(tf);
f.add(b);


f.setVisible(true);
f.setSize(300, 300);

}


}