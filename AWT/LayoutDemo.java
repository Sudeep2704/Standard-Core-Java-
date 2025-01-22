import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener {
    Button b1, b2, b3;
    TextField t1, t2, t3;
    Panel p1, p2, cp, mainp;
    Checkbox c1, c2;
    CardLayout cl;

    public MyFrame() {
        super("CardLayout Demo");

        // Create a CheckboxGroup for mutual exclusivity
        CheckboxGroup cg = new CheckboxGroup();

        c1 = new Checkbox("One", true, cg);
        c2 = new Checkbox("Two", false, cg);

        // Add ItemListeners to checkboxes
        c1.addItemListener(this);
        c2.addItemListener(this);

        // Create Buttons
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");

        // Create TextFields
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        // Create the Checkbox panel
        cp = new Panel();
        cp.setLayout(new FlowLayout());
        cp.add(c1);
        cp.add(c2);

        // Create Panel 1 with buttons
        p1 = new Panel();
        p1.setLayout(new FlowLayout());
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        // Create Panel 2 with text fields
        p2 = new Panel();
        p2.setLayout(new FlowLayout());
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        // Create main Panel with CardLayout
        mainp = new Panel();
        cl = new CardLayout();
        mainp.setLayout(cl);

        mainp.add("One", p1);
        mainp.add("Two", p2);

        // Add components to the Frame
        setLayout(new BorderLayout());
        add(cp, BorderLayout.NORTH);
        add(mainp, BorderLayout.CENTER);

        // Set Frame properties
        setSize(500, 500);
        setVisible(true);

        // Close the application on window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle Checkbox state change
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (c1.getState()) {
            cl.first(mainp); // Show the first card
        } else {
            cl.last(mainp); // Show the second card
        }
    }
}

public class LayoutDemo {
    public static void main(String[] args) {
        new MyFrame();
    }
}
