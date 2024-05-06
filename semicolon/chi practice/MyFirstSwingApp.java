import javax.swing.*;

public class MyFirstSwingApp {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the app when the window is closed
        frame.setSize(300, 300); // Set the window size

        // Create a JButton
        JButton button = new JButton("Press Me");

        button.setBounds(130, 100, 100, 40); // Set button position and size
        frame.add(button); // Add the button to the frame

        // Set layout to null (no layout manager)
        frame.setLayout(null);
 
        // Make the frame visible
        frame.setVisible(true);
    }
}