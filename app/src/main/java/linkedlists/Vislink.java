package linkedlists;

import java.awt.*;
import javax.swing.*;

public class Vislink {
    private JFrame f;
    private JPanel field;
    private JPanel optionBar;

    private JLabel setup;
    private JLabel listToBeChosen;
    private JComboBox<String> listType;
    private JLabel dataToBeChosen;
    private JComboBox<String> dataType;

    private JLabel addition;
    private JLabel elementToBeAdded;
    private JTextField toBeAdded;
    private JButton addFirst;
    private JButton addLast;
    private JButton add;
    private JLabel indexToBeAdded;
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
        this.listToBeChosen = new JLabel("CHOSE LIST TYPE");
        this.dataToBeChosen = new JLabel("CHOSE DATA TYPE");

        String[] listTypes = {
            "Single Linked List",
            "Cirkular Linked List",
            "Double Linked List"
        };
        this.listType = new JComboBox<>(listTypes);

        String[] dataTypes = {
            "Integer", "Double",
            "Char", "String" 
        };
        this.dataType = new JComboBox<>(dataTypes);

        data.setBounds(1510, 5, 40, 30);
        data.setForeground(Color.GREEN);
        data.setFont(new Font("Monospaced", Font.PLAIN, 16));
        size.setBounds(1800, 5, 50, 30);
        size.setForeground(Color.GREEN);
        size.setFont(new Font("Monospaced", Font.PLAIN, 16));
        setup.setBounds(10, 5, 60, 30);
        setup.setForeground(Color.WHITE);
        setup.setFont(new Font("Monospaced", Font.PLAIN, 16));
        addition.setBounds(350, 5, 80, 30);
        addition.setForeground(Color.GREEN);
        addition.setFont(new Font("Monospaced", Font.PLAIN, 16));
        removal.setBounds(700, 5, 80, 30);
        removal.setForeground(Color.RED);
        removal.setFont(new Font("Monospaced", Font.PLAIN, 16));
        uitility.setBounds(1050, 5, 80, 30);
        uitility.setForeground(Color.MAGENTA);
        uitility.setFont(new Font("Monospaced", Font.PLAIN, 16));

        listToBeChosen.setBounds(10, 40, 150, 30);
        listToBeChosen.setForeground(Color.WHITE);
        listToBeChosen.setFont(new Font("Monospaced", Font.PLAIN, 16));        
        listType.setBounds(10, 75, 150, 30);
        dataToBeChosen.setBounds(10, 110, 150, 30);
        dataToBeChosen.setForeground(Color.WHITE);
        dataToBeChosen.setFont(new Font("Monospaced", Font.PLAIN, 16));
        dataType.setBounds(10, 145, 150, 30);

        field.setBackground(Color.BLACK);
        field.setBounds(0, 0, 1920, 760);
        field.setLayout(null);

        optionBar.setBackground(Color.DARK_GRAY);
        optionBar.setBounds(0, 760, 1920, 200);
        optionBar.setLayout(null);

        status.setBackground(Color.BLACK);  
        status.setBounds(1510, 40, 400, 150); 
        status.setLayout(null);

        optionBar.add(status);
        optionBar.add(data);
        optionBar.add(size);
        optionBar.add(setup);
        optionBar.add(addition);
        optionBar.add(removal);
        optionBar.add(uitility);
        optionBar.add(listToBeChosen);
        optionBar.add(listType);
        optionBar.add(dataToBeChosen);
        optionBar.add(dataType);

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
