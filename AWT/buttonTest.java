import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener {

    int count = 0; // Counter for button clicks
    Label l;
    Button b;

    public MyFrame() {
        super("Button Demo");

        // Initialize components
        l = new Label("  " + count);
        b = new Button("Click");

        // Add ActionListener to the button
        b.addActionListener(this);

        // Set layout and add components
        setLayout(new FlowLayout());
        add(l);
        add(b);

        // Configure frame settings
        setSize(400, 400);
        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        count++; // Increment count
        l.setText("  " + count); // Update label text
    }
}

public class buttonTest {
    public static void main(String[] args) {
        new MyFrame(); // Create and display the frame
    }
}
