package Day_60_LambdaExpressions;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LambdaGUIExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Lambda GUI Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();

            JLabel label = new JLabel("Click the button!");

            JButton button = new JButton("Click Me");
            button.addActionListener(e -> label.setText("Button Clicked!"));

            panel.add(label);
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
