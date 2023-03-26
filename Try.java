import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Try {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        final int[] counter = {0};

        JButton loginButton = new JButton("Login");
        JButton clearButton = new JButton("Clear");

        JLabel message = new JLabel("");
        JLabel usernameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        JLabel attemptsLabel = new JLabel("Attempts: 0");

        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);


        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        f.setLayout(layout);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        f.add(usernameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;

        f.add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;

        f.add(passwordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;

        f.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;

        f.add(loginButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;

        f.add(clearButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;

        f.add(message, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;

        f.add(attemptsLabel, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();

                if (username.equals("admin") && password.equals("admin")) {
                    message.setText("Login Successful");
                } else {
                    message.setText("Login Failed");
                    attemptsLabel.setText(++counter[0] +" attempts");
                }
            }
        });


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
                counter[0] = 0;
                message.setText("");
                attemptsLabel.setText("0 attempts");
            }
        });

    }
}

