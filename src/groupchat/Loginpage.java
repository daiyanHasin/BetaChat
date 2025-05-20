
package groupchat;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Loginpage implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel betachat = new JLabel("BETACHAT!!");
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel();
    HashMap<String, String> logininfo = new HashMap<String, String>();

    Loginpage(HashMap<String, String> loginInfoOriginal) {
        frame.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);

        logininfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 14));
        betachat.setBounds(150, 30, 115, 25);
        betachat.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        betachat.setForeground(Color.BLUE);

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
    
        frame.add(betachat);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }

        {
            if (e.getSource() == loginButton) {

                String userID = userIDField.getText();
                String password = String.valueOf(userPasswordField.getPassword());

                if (logininfo.containsKey(userID)) {
                    if (logininfo.get(userID).equals(password)) {
                        messageLabel.setForeground(Color.green);
                        messageLabel.setText("Login successful");
                        frame.dispose();
                        UserOne.main(null);
                        UserTwo.main(null);
                        UserThird.main(null);
                    }
                } else {
                    messageLabel.setForeground(Color.red);
                   // messageLabel.setText(" Invalid");
                    messageLabel.setText(" Wrong Password");
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("username not found");
            }
        }
    }
}
