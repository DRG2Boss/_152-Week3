// Isaiah Marshall
// COMP 152
// July 24th, 26th, and 27th 2023

// javax.swing library needed for graphics functions. "*" means import ALL libraries within swing.
import javax.swing.*;

public class graphicsWindow {
    public static void main(String[] args) {
        // windowing class is called a JFrame
        // make JFrame variable myWindow
        // MUST call "new" to actually bring the object into existence
        // Exactly how we've done it with Scanner
        JFrame myWindow = new JFrame();
        // Graphics initialization after "new" and before setVisible (so we don't see it resized in realtime).
        myWindow.setSize(500, 300);
        myWindow.setTitle("My shiny new window!");
        // Make the close button on the window work
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // This line means don't try to lay out graphics objects for us.
            // Instead, rely on user specified setSize and setBounds for everything.
        // myWindow.setLayout(null);

        // This will take some object and size them for us AUTOMATICALLY as opposed to using setLayout.
        JPanel panel = new JPanel();

        // Non-interactable text area
        JTextArea textPanel = new JTextArea();

        // Show text within a window
        JLabel label = new JLabel();
        label.setText("Press the button of your choice.");

        // How to add an image:
            // JLabel picture = new JLabel();
            // picture.setIcon(new ImageIcon("filepath"));
            // panel.add(label);
            // panel.add(picture);

        // Two ways to specify button text. In-line and new-line.
        JButton button = new JButton("Push me!");
        // button.setBounds(200, 100, 100, 40);
        JButton button2 = new JButton();
        button2.setText("Don't push me!");

        // Classes in Java are able to exist within a larger class. Aka subclasses or "Components".
        panel.add(label);
        panel.add(button);
        panel.add(button2);

        myWindow.add(panel);

        // Windows are invisible by default until we TELL them to be visible.
        myWindow.setVisible(true);
    }
}