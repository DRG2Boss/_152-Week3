import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonStuff {
    public static void main(String[] args) {
        // Step one: Make a window
        // Make and construct the variable
        // AND give it a title all on the same line.
        JFrame window = new JFrame("Button Example");
        // Make the window a reasonable size.
        window.setSize(500, 500);

        // When we have a number in code, and we have no idea what it does, it's called a "Magic Number".
            // For example, window.setDefaultCloseOperation(3) behaves the same as the below line.
        // These are not clear, and should therefore be avoided if possible.
        // EXIT_ON_CLOSE is a CONSTANT variable
        // Meaning it's just a stand-in for a number value and cannot be modified.
            // These are represented in ALL_CAPS.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create simple label.
        JLabel label = new JLabel("Nothing Pressed");

        // Make a button called "Left"
        JButton button1 = new JButton("Left");

        // Use addActionListener function to make something happen when button is selected.
        // We're using an "Anonymous Function".
        // This runs a function even though the code doesn't call it or main ends.
            // It's instead a function that is called by the Operating System.
            // This style of coding is called "Event-Driven Programming".
                // If action performed -> do more programming.
                // After/before action performed -> function goes to sleep.
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Automatically modify the label to state that x button was pressed.
                label.setText(button1.getText() + " button pressed.");
            }
        });

        // Now make a button called "Right"
        JButton button2 = new JButton("Right");
        // Repeat function build for this button.
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(button2.getText() + " button pressed.");
            }
        });

        // Remember, can't see buttons until added to window
        // First, put everything into panel so its of appropriate sizing.
        // And so everything does not overlay on top of each other.
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        window.add(panel);
        // The window exists, but you can't see it.
        window.setVisible(true);
    }
}
