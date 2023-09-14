

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassExample2 {
    public static void main(String[] args) {
        // Create a simple JFrame with a button
        JFrame frame = new JFrame("Anonymous Class Example");
        JButton button = new JButton("Click Me");
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Add an ActionListener using an anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Button clicked!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}

