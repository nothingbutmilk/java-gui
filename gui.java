//importing needed libraries 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame(); 
        //sets frame measurements
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        //adds "user" label and sets its position on the popout window
        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);


        frame.setVisible(true);
        
    }
}
