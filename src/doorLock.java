// NOTE: Update notes once they are posted to blackboard.
// Create a door lock that only unlocks if a certain sequence of buttons are selected.
// Sequence answer is 3, 1, 2.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class doorLock {

    // Right now, here is the rule (will break this rule and understand more next week):
        // main function is static
        // anything inside of main is local, not static
        // anything outside of main, but within class, must also be static

    // These variables are shared between functions, need to make it a GLOBAL variable.
    // keysPressed tracks # of keys have been selected.
    public static int keysPressed = 0;
    // good tracks # keys pressed correctly in sequence.
    public static int good = 0;
    // Correct code array
    public static int[] secretCode = new int[] {3,1,2};

    public static void main(String[] args) {
        JFrame window = new JFrame("Locked door.");
        JPanel panel = new JPanel();
        JLabel message = new JLabel("Please enter the code sequence:");
        panel.add(message);

        // Make three buttons
        for(int i = 1; i < 4; i++) {
            // Each button is labeled 1, 2, 3 in order.
            JButton key = new JButton(""+i);
            // This is performed whenever a key is pressed.
            key.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Key is pressed, add 1 to KeysPressed
                    keysPressed = keysPressed + 1;
                    // This variable is defined globally, meaning outside of main, and is considered static.

                    // I can tell which button is selected by looking at key.getText()
                    String buttonID = key.getText(); // buttonID is 1 or 2 or 3

                    // Convert String buttonID into an integer type.
                    int buttonNumber = Integer.parseInt(buttonID);

                    // Look to a certain position within secretCode
                    // Based on keysPressed current value
                    // If it's equal to the buttonNumber selected, add 1 to good.
                    if(secretCode[keysPressed-1] == buttonNumber) {
                        good++;
                    }

                    // Things happen upon third keypress
                    if(keysPressed == 3) {
                        // If we did three correct keys, unlock door.
                        if(good == 3) {
                            message.setText("Door unlocked!");
                        }
                        // Otherwise, keep door locked and present message.
                        else {
                            message.setText("Code entered incorrectly. Please try again.");
                        }
                        // Regardless of if door stays locked or unlocks, reset keysPressed and good.
                        keysPressed = 0;
                        good = 0;
                    }
                }
            });
            panel.add(key);
        }
        window.add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setVisible(true);
    }
}
