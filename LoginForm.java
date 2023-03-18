import javax.swing.*;

public class LoginForm extends JFrame{

    private JPanel panel;
    private JButton button1;
    private JTextField textField1;
    private JButton button2;
    private JTextField textField2;

    public LoginForm(){

       panel = new JPanel();
       button1 = new JButton("User ID");
       textField1 = new JTextField(15);
       button2 = new JButton("Password");
       textField2 = new JTextField(15);

       panel.add(button1);
       panel.add(textField1);

        panel.add(button2);
        panel.add(textField2);
        add(panel);

        this.setVisible(true);
        this.setSize(300,200);
        this.setTitle("Login Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}