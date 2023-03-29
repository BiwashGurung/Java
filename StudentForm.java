import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class StudentForm extends JFrame implements ActionListener {

    // GUI components
    private JLabel nameLabel;
    private JLabel ageLabel;
    private JLabel addressLabel;
    private JLabel phoneLabel;
    private JTextField nameField;
    private JTextField ageField;
    private JTextField addressField;
    private JTextField phoneField;
    private JButton addButton;
    private JButton showButton;

    // ArrayList to store student data
    private ArrayList<String[]> studentData = new ArrayList<>();

    public StudentForm() {
        // Set up the frame

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Student Form");

        // Set up the layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add the name label and text field
        nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        nameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);

        // Add the age label and text field
        ageLabel = new JLabel("Age:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(ageLabel, gbc);

        ageField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(ageField, gbc);

        // Add the address label and text field
        addressLabel = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(addressLabel, gbc);

        addressField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(addressField, gbc);

        // Add the phone label and text field
        phoneLabel = new JLabel("Phone:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(phoneLabel, gbc);

        phoneField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(phoneField, gbc);

        // Add the add button
        addButton = new JButton("Add Student");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(addButton, gbc);
        addButton.addActionListener(this);

        // Add the show button
        showButton = new JButton("Show Data");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(showButton, gbc);
        showButton.addActionListener(this);

        pack();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            // Get the student data from the fields
            String[] student = new String[4];
            student[0] = nameField.getText();
            student[1] = ageField.getText();
            student[2] = addressField.getText();
            student[3] = phoneField.getText();

            // Add the student data to the ArrayList
            studentData.add(student);

            // Clear the fields
            nameField.setText("");
            ageField.setText("");
            addressField.setText("");
            phoneField.setText("");
        } else if (e.getSource() == showButton) {
            // Create a string to hold the student data
            String data = " ";
            for (String[] student : studentData) {
                data += "Name: " + student[0] + "\n"
                        + "Age: " + student[1] + "\n"
                        + "Address: " + student[2] + "\n"
                        + "Phone: " + student[3] + "\n\n";
            }
            JOptionPane.showMessageDialog(null, data, "Student Data", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}