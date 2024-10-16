package linkedlists;

import java.awt.*;
import javax.swing.*;

public class Vislink {
    private JFrame f;
    private JPanel field;
    private JPanel optionBar;
    private JComboBox<String> listType;
    private JComboBox<String> dataType;

    private JTextField toBeAdded;
    private JButton addFirst;
    private JButton addLast;
    private JButton add;
    private JTextField addIndex;

    private JTextField toBeRemoved;
    private JButton removeFirst;
    private JButton removeLast;
    private JButton remove;
    private JButton removeAt;
    private JTextField removeIndex;

    private JButton Sort;
    private JButton Swap;
    private JButton get;
    private JTextField getElement;

    private JLabel size;
    private JPanel status;

    public Vislink() {
        this.f = new JFrame("VISLINK");
        this.field = new JPanel();
        this.optionBar = new JPanel();

        field.setBackground(Color.BLACK);
        field.setBounds(0, 0, 1920, 860);
        field.setLayout(null);

        optionBar.setBackground(Color.DARK_GRAY);
        optionBar.setBounds(0, 860, 1920, 100);
        optionBar.setLayout(null);

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
