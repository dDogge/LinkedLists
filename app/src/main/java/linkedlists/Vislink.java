package linkedlists;

import java.awt.*;
import javax.swing.*;

public class Vislink {
    private JFrame f;
    private JPanel field;
    private JPanel optionBar;

    private JLabel setup;
    private JComboBox<String> listType;
    private JComboBox<String> dataType;

    private JLabel addition;
    private JLabel elementToBeAdded;
    private JTextField toBeAdded;
    private JButton addFirst;
    private JButton addLast;
    private JButton add;
    private JTextField addIndex;

    private JLabel removal;
    private JLabel elementToBeRemoved;
    private JTextField toBeRemoved;
    private JButton removeFirst;
    private JButton removeLast;
    private JButton remove;
    private JButton removeAt;
    private JLabel indexToBeRemoved;
    private JTextField removeIndex;

    private JLabel uitility;
    private JButton Sort;
    private JButton Swap;
    private JButton get;
    private JLabel getElemenmtLabel;
    private JTextField getElement;

    private JLabel data;
    private JLabel size;
    private JPanel status;

    public Vislink() {
        this.f = new JFrame("VISLINK");
        this.field = new JPanel();
        this.optionBar = new JPanel();
        this.setup = new JLabel("SETUP");
        this.addition = new JLabel("ADDITION");
        this.removal = new JLabel("REMOVAL");
        this.uitility = new JLabel("UTILITY");
        this.data = new JLabel("DATA");
        this.size = new JLabel("SIZE:");
        this.status = new JPanel();

        data.setBounds(1510, 5, 40, 30);
        data.setForeground(Color.GREEN);
        data.setFont(new Font("Monospaced", Font.PLAIN, 16));
        size.setBounds(1800, 5, 50, 30);
        size.setForeground(Color.GREEN);
        size.setFont(new Font("Monospaced", Font.PLAIN, 16));

        field.setBackground(Color.BLACK);
        field.setBounds(0, 0, 1920, 760);
        field.setLayout(null);

        optionBar.setBackground(Color.DARK_GRAY);
        optionBar.setBounds(0, 760, 1920, 200);
        optionBar.setLayout(null);

        status.setBackground(Color.BLACK);  // Black background
        status.setBounds(1510, 40, 400, 150);  // Placed on the right side of optionBar
        status.setLayout(null);

        optionBar.add(status);
        optionBar.add(data);
        optionBar.add(size);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(field);
        f.add(optionBar);
        f.setLayout(null);
        f.setSize(1920, 960);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
    }
}
