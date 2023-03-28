import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyGridBagLayout {

    ArrayList<Student> list = new ArrayList<Student>();

    public MyGridBagLayout(){
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JButton okButton = new JButton("Ok");
        JButton clearButton = new JButton("Clear");
        JButton showMore = new JButton("Show");

        JLabel nameLabel = new JLabel("Username");
        JLabel addressLabel = new JLabel("Address");
        JLabel ageLabel = new JLabel("Age");
        JLabel phoneNumberLabel = new JLabel("Phone Number");

        JTextField nameField = new JTextField(20);
        JTextField addressField = new JTextField(20);
        JTextField ageField = new JTextField(20);
        JTextField phoneNumberField = new JTextField(20);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        f.setLayout(layout);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        f.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;

        f.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;

        f.add(addressLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;

        f.add(addressField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;

        f.add(ageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;

        f.add(ageField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;

        f.add(phoneNumberLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;

        f.add(phoneNumberField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;

        f.add(okButton,gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;

        f.add(clearButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;

        f.add(showMore, gbc);


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String phoneNumber = phoneNumberField.getText();
                String address = addressField.getText();


                Student s1 = new Student(name,age,address,phoneNumber);

                list.add(s1);

                addressField.setText("");
                nameField.setText("");
                ageField.setText("");
                phoneNumberField.setText("");

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addressField.setText("");
                nameField.setText("");
                ageField.setText("");
                phoneNumberField.setText("");
            }
        });


        showMore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Student std: list){
                    JFrame fr = new JFrame();
                    fr.setSize(500, 500);
                    fr.setVisible(true);

                    JLabel nameLabelName = new JLabel("Name");
                    JLabel addressLabelAddress = new JLabel("Address");
                    JLabel ageLabelAge = new JLabel("Age");
                    JLabel phoneNumberLabelPhone = new JLabel("Phone Number");

                    JLabel nameLabel = new JLabel(std.getName());
                    JLabel addressLabel = new JLabel(std.getAddress());
                    JLabel ageLabel = new JLabel(std.getAge());
                    JLabel phoneNumberLabel = new JLabel(std.getPhone());

                    GridBagLayout layout = new GridBagLayout();
                    GridBagConstraints gbc = new GridBagConstraints();

                    fr.setLayout(layout);

                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    gbc.insets = new Insets(10, 10, 10, 10);
                    fr.add(nameLabelName, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 0;
                    fr.add(nameLabel, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    fr.add(addressLabelAddress, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 1;
                    fr.add(addressLabel, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    fr.add(ageLabelAge, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 2;
                    fr.add(ageLabel, gbc);

                    gbc.gridx = 0;
                    gbc.gridy = 3;
                    fr.add(phoneNumberLabelPhone, gbc);

                    gbc.gridx = 1;
                    gbc.gridy = 3;
                    fr.add(phoneNumberLabel, gbc);
                }
            }
        });



    }



}

