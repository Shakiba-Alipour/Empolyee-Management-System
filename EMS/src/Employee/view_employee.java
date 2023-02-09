package Employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class view_employee implements ActionListener {

    public JFrame frame;
    public JTextField t;
    public JLabel l1, l2;
    public JButton b1, b2;

    public view_employee() {
        frame = new JFrame("View");
        frame.setBackground(Color.green);
        frame.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0, 0, 500, 270);
        l1.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icon/view.jpg"));
        l1.setIcon(img);


        l2 = new JLabel("Employee Id");
        l2.setVisible(true);
        l2.setBounds(40, 60, 250, 30);
        l2.setForeground(Color.white);
        Font F1 = new Font("serif", Font.BOLD, 30);
        l2.setFont(F1);
        l1.add(l2);
        frame.add(l1);


        t = new JTextField();
        t.setFont(new Font("serif", Font.BOLD, 17));
        t.setBounds(240, 60, 220, 30);
        l1.add(t);

        b1 = new JButton("Search");
        b1.setBounds(240, 150, 100, 30);
        b1.addActionListener(this);
        l1.add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(360, 150, 100, 30);
        b2.addActionListener(this);
        l1.add(b2);

        frame.setSize(500, 270);
        frame.setLocation(450, 250);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b2) {
            frame.setVisible(false);
            Employee.details_page d = new Employee.details_page();
        }
        if (ae.getSource() == b1) {
            frame.setVisible(false);
            Employee.print_data p = new Employee.print_data(t.getText());
        }

    }

    public static void main(String[] ar) {
        view_employee v = new view_employee();
    }
}