package linkedlists;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

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
    private JLabel element1;
    private JLabel element2;
    private JTextField selectedElement1;
    private JTextField selectedElement2;
    private JButton get;
    private JLabel getElemenmtLabel;
    private JTextField getElement;

    private JLabel data;
    private JLabel size;
    private JPanel status;

    private Object linkedList;
    private String currentDataType;

    @SuppressWarnings("unchecked")
    public Vislink() {
        this.f = new JFrame("VISLINK");
        this.field = new ListPanel();
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
        this.elementToBeAdded = new JLabel("TYPE ELEMENT");
        this.toBeAdded = new JTextField();
        this.addFirst = new JButton("ADD FIRST");
        this.addLast = new JButton("ADD LAST");
        this.add = new JButton("ADD AT INDEX");
        this.indexToBeAdded = new JLabel("TYPE INDEX");
        this.addIndex = new JTextField();
        this.elementToBeRemoved = new JLabel("TYPE ELEMENT");
        this.toBeRemoved = new JTextField();
        this.removeFirst = new JButton("REMOVE FIRST");
        this.removeLast = new JButton("REMOVE LAST");
        this.remove = new JButton("REMOVE ELEMENT");
        this.removeAt = new JButton("REMOVE AT INDEX");
        this.indexToBeRemoved = new JLabel("TYPE INDEX");
        this.removeIndex = new JTextField();
        this.Sort = new JButton("SORT LIST");
        this.Swap = new JButton("SWAP ELEMENTS");
        this.element1 = new JLabel("TYPE ELEMENT 1");
        this.element2 = new JLabel("TYPE ELEMENT 2");
        this.selectedElement1 = new JTextField();
        this.selectedElement2 = new JTextField();
        this.get = new JButton("GET ELEMENT");
        this.getElemenmtLabel = new JLabel("TYPE ELEMENT");
        this.getElement = new JTextField();

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
        listType.addActionListener(e -> createList());
        dataType.addActionListener(e -> createList());

        elementToBeAdded.setBounds(350, 40, 150, 30);
        elementToBeAdded.setForeground(Color.GREEN);
        elementToBeAdded.setFont(new Font("Monospaced", Font.PLAIN, 16));
        toBeAdded.setBounds(350, 75, 150, 20);
        addFirst.setBounds(350, 100, 150, 40);
        addFirst.setBackground(Color.GREEN);
        addFirst.addActionListener(e -> {
            String input = toBeAdded.getText();

            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Input is empty.");
                return;
            }

            if (linkedList == null) {
                JOptionPane.showMessageDialog(f, "Please select a list type and data type.");
                return;
            }

            try {
                switch (currentDataType) {
                    case "Integer":
                        Integer intValue = Integer.parseInt(input);
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Integer>) linkedList).addFirst(intValue);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Integer>) linkedList).addFirst(intValue);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Integer>) linkedList).addFirst(intValue);
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<String>) linkedList).addFirst(input);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<String>) linkedList).addFirst(input);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<String>) linkedList).addFirst(input);
                        }
                        break;
                    case "Double":
                        Double doubleValue = Double.parseDouble(input);
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Double>) linkedList).addFirst(doubleValue);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Double>) linkedList).addFirst(doubleValue);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Double>) linkedList).addFirst(doubleValue);
                        }
                        break;
                    case "Char":
                        if (input.length() == 1) {
                            char charValue = input.charAt(0);
                            if (linkedList instanceof SingleLinkedList1) {
                                ((SingleLinkedList1<Character>) linkedList).addFirst(charValue);
                            } else if (linkedList instanceof SingleLinkedList2) {
                                ((SingleLinkedList2<Character>) linkedList).addFirst(charValue);
                            } else if (linkedList instanceof DoubleLinkedList) {
                                ((DoubleLinkedList<Character>) linkedList).addFirst(charValue);
                            }
                        } else {
                            throw new IllegalArgumentException("Input is not a valid character.");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
                visualizeList();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(f, "Input does not match the selected data type.");
            } catch (ClassCastException ex) {
                JOptionPane.showMessageDialog(f, "List type mismatch.");
            }
        });
        addLast.setBounds(350, 145, 150, 40);
        addLast.setBackground(Color.GREEN);
        addLast.addActionListener(e -> {
            String input = toBeAdded.getText();

            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Input is empty.");
                return;
            }

            if (linkedList == null) {
                JOptionPane.showMessageDialog(f, "Please select a list type and data type.");
                return;
            }

            try {
                switch (currentDataType) {
                    case "Integer":
                        Integer intValue = Integer.parseInt(input);
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Integer>) linkedList).addLast(intValue);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Integer>) linkedList).addLast(intValue);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Integer>) linkedList).addLast(intValue);
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<String>) linkedList).addLast(input);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<String>) linkedList).addLast(input);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<String>) linkedList).addLast(input);
                        }
                        break;
                    case "Double":
                        Double doubleValue = Double.parseDouble(input);
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Double>) linkedList).addLast(doubleValue);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Double>) linkedList).addLast(doubleValue);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Double>) linkedList).addLast(doubleValue);
                        }
                        break;
                    case "Char":
                        if (input.length() == 1) {
                            char charValue = input.charAt(0);
                            if (linkedList instanceof SingleLinkedList1) {
                                ((SingleLinkedList1<Character>) linkedList).addLast(charValue);
                            } else if (linkedList instanceof SingleLinkedList2) {
                                ((SingleLinkedList2<Character>) linkedList).addLast(charValue);
                            } else if (linkedList instanceof DoubleLinkedList) {
                                ((DoubleLinkedList<Character>) linkedList).addLast(charValue);
                            }
                        } else {
                            throw new IllegalArgumentException("Input is not a valid character.");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
                visualizeList();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(f, "Input does not match the selected data type.");
            } catch (ClassCastException ex) {
                JOptionPane.showMessageDialog(f, "List type mismatch.");
            }
        });
        indexToBeAdded.setBounds(505, 40, 150, 30);
        indexToBeAdded.setForeground(Color.GREEN);
        indexToBeAdded.setFont(new Font("Monospaced", Font.PLAIN, 16));
        addIndex.setBounds(505, 75, 150, 20);
        add.setBounds(505, 100, 150, 40);
        add.setBackground(Color.GREEN);
        add.addActionListener(e -> {
            String input1 = toBeAdded.getText();
            String input2 = addIndex.getText();
            Integer index = Integer.parseInt(input2);
            int listSize = 0;

            if (input1.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Input is empty.");
                return;
            }

            if (input2.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Index is empty.");
                return;
            }

            if (linkedList == null) {
                JOptionPane.showMessageDialog(f, "Please select a list type and data type.");
                return;
            }

            try {

                switch (currentDataType) {
                    case "Integer":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Integer>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Integer>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Integer>) linkedList).size();
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<String>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<String>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<String>) linkedList).size();
                        }
                        break;
                    case "Double":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Double>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Double>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Double>) linkedList).size();
                        }
                        break;
                    case "Char":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Character>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Character>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Character>) linkedList).size();
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }

                if (index < 0) {
                    JOptionPane.showMessageDialog(f, "This list only supports indexes equal to or above: 0");
                    return; 
                }

                if (index > listSize) {
                    JOptionPane.showMessageDialog(f, "Cannot add an element at index " + index + "! List size must be increased!");
                }

                switch (currentDataType) {
                    case "Integer":
                        Integer intValue = Integer.parseInt(input1);
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Integer>) linkedList).add(intValue, index);;
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Integer>) linkedList).add(intValue, index);;
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Integer>) linkedList).add(intValue, index);;
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<String>) linkedList).add(input1, index);;
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<String>) linkedList).add(input1, index);;
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<String>) linkedList).add(input1, index);;
                        }
                        break;
                    case "Double":
                        Double doubleValue = Double.parseDouble(input1);
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Double>) linkedList).add(doubleValue, index);;
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Double>) linkedList).add(doubleValue, index);;
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Double>) linkedList).add(doubleValue, index);;
                        }
                        break;
                    case "Char":
                        if (input1.length() == 1) {
                            char charValue = input1.charAt(0);
                            if (linkedList instanceof SingleLinkedList1) {
                                ((SingleLinkedList1<Character>) linkedList).add(charValue, index);
                            } else if (linkedList instanceof SingleLinkedList2) {
                                ((SingleLinkedList2<Character>) linkedList).add(charValue, index);
                            } else if (linkedList instanceof DoubleLinkedList) {
                                ((DoubleLinkedList<Character>) linkedList).add(charValue, index);
                            }
                        } else {
                            throw new IllegalArgumentException("Input is not a valid character.");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
                visualizeList();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(f, "Input does not match the selected data type.");
            } catch (ClassCastException ex) {
                JOptionPane.showMessageDialog(f, "List type mismatch.");
            }
        });

        elementToBeRemoved.setBounds(700, 40, 150, 30);
        elementToBeRemoved.setForeground(Color.RED);
        elementToBeRemoved.setFont(new Font("Monospaced", Font.PLAIN, 16));
        toBeRemoved.setBounds(700, 75, 150, 20);
        remove.setBounds(700, 100, 150, 40);
        remove.setBackground(Color.RED);
        remove.addActionListener(e -> {
            String input = toBeRemoved.getText();
        
            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Input is empty.");
                return;
            }
        
            if (linkedList == null) {
                JOptionPane.showMessageDialog(f, "Please select a list type and data type.");
                return;
            }
        
            boolean elementExists = false;  // Variabel för att hålla koll på om elementet finns
        
            try {
                switch (currentDataType) {
                    case "Integer":
                        Integer intValue = Integer.parseInt(input);
                        if (linkedList instanceof SingleLinkedList1) {
                            elementExists = ((SingleLinkedList1<Integer>) linkedList).exists(intValue);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            elementExists = ((SingleLinkedList2<Integer>) linkedList).exists(intValue);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            elementExists = ((DoubleLinkedList<Integer>) linkedList).exists(intValue);
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            elementExists = ((SingleLinkedList1<String>) linkedList).exists(input);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            elementExists = ((SingleLinkedList2<String>) linkedList).exists(input);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            elementExists = ((DoubleLinkedList<String>) linkedList).exists(input);
                        }
                        break;
                    case "Double":
                        Double doubleValue = Double.parseDouble(input);
                        if (linkedList instanceof SingleLinkedList1) {
                            elementExists = ((SingleLinkedList1<Double>) linkedList).exists(doubleValue);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            elementExists = ((SingleLinkedList2<Double>) linkedList).exists(doubleValue);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            elementExists = ((DoubleLinkedList<Double>) linkedList).exists(doubleValue);
                        }
                        break;
                    case "Char":
                        if (input.length() == 1) {
                            char charValue = input.charAt(0);
                            if (linkedList instanceof SingleLinkedList1) {
                                elementExists = ((SingleLinkedList1<Character>) linkedList).exists(charValue);
                            } else if (linkedList instanceof SingleLinkedList2) {
                                elementExists = ((SingleLinkedList2<Character>) linkedList).exists(charValue);
                            } else if (linkedList instanceof DoubleLinkedList) {
                                elementExists = ((DoubleLinkedList<Character>) linkedList).exists(charValue);
                            }
                        } else {
                            throw new IllegalArgumentException("Input is not a valid character.");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
        
                if (!elementExists) {
                    JOptionPane.showMessageDialog(f, "That element is not present.");
                    return; 
                }
        
                switch (currentDataType) {
                    case "Integer":
                        Integer intValue = Integer.parseInt(input);
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Integer>) linkedList).remove(intValue);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Integer>) linkedList).remove(intValue);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Integer>) linkedList).remove(intValue);
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<String>) linkedList).remove(input);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<String>) linkedList).remove(input);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<String>) linkedList).remove(input);
                        }
                        break;
                    case "Double":
                        Double doubleValue = Double.parseDouble(input);
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Double>) linkedList).remove(doubleValue);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Double>) linkedList).remove(doubleValue);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Double>) linkedList).remove(doubleValue);
                        }
                        break;
                    case "Char":
                        if (input.length() == 1) {
                            char charValue = input.charAt(0);
                            if (linkedList instanceof SingleLinkedList1) {
                                ((SingleLinkedList1<Character>) linkedList).remove(charValue);
                            } else if (linkedList instanceof SingleLinkedList2) {
                                ((SingleLinkedList2<Character>) linkedList).remove(charValue);
                            } else if (linkedList instanceof DoubleLinkedList) {
                                ((DoubleLinkedList<Character>) linkedList).remove(charValue);
                            }
                        } else {
                            throw new IllegalArgumentException("Input is not a valid character.");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
        
                visualizeList();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(f, "Input does not match the selected data type.");
            } catch (ClassCastException ex) {
                JOptionPane.showMessageDialog(f, "List type mismatch.");
            }
        });
        removeFirst.setBounds(700, 145, 150, 40);
        removeFirst.setBackground(Color.RED);
        removeFirst.addActionListener(e -> {
            try {
                switch (currentDataType) {
                    case "Integer":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Integer>) linkedList).removeFirst();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Integer>) linkedList).removeFirst();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Integer>) linkedList).removeFirst();
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<String>) linkedList).removeFirst();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<String>) linkedList).removeFirst();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<String>) linkedList).removeFirst();
                        }
                        break;
                    case "Double":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Double>) linkedList).removeFirst();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Double>) linkedList).removeFirst();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Double>) linkedList).removeFirst();
                        }
                        break;
                    case "Char":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Character>) linkedList).removeFirst();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Character>) linkedList).removeFirst();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Character>) linkedList).removeFirst();
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
                visualizeList();
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            } 
        });
        indexToBeRemoved.setBounds(855, 40, 150, 30);
        indexToBeRemoved.setForeground(Color.RED);
        indexToBeRemoved.setFont(new Font("Monospaced", Font.PLAIN, 16));
        removeIndex.setBounds(855, 75, 150, 20);
        removeAt.setBounds(855, 100, 150, 40);
        removeAt.setBackground(Color.RED);
        removeAt.addActionListener(e -> {
            String input1 = removeIndex.getText();
            Integer index = Integer.parseInt(input1);
            int listSize = 0;

            if (input1.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Input is empty.");
                return;
            }

            if (linkedList == null) {
                JOptionPane.showMessageDialog(f, "Please select a list type and data type.");
                return;
            }

            try {
                switch (currentDataType) {
                    case "Integer":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Integer>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Integer>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Integer>) linkedList).size();
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<String>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<String>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<String>) linkedList).size();
                        }
                        break;
                    case "Double":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Double>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Double>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Double>) linkedList).size();
                        }
                        break;
                    case "Char":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Character>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Character>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Character>) linkedList).size();
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }

                if (index < 0 || index >= listSize) {
                    JOptionPane.showMessageDialog(f, "No element present at index: " + index);
                    return; 
                }
            
                switch (currentDataType) {
                    case "Integer":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Integer>) linkedList).removeAt(index);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Integer>) linkedList).removeAt(index);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Integer>) linkedList).removeAt(index);
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<String>) linkedList).removeAt(index);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<String>) linkedList).removeAt(index);;
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<String>) linkedList).removeAt(index);
                        }
                        break;
                    case "Double":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Double>) linkedList).removeAt(index);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Double>) linkedList).removeAt(index);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Double>) linkedList).removeAt(index);
                        }
                        break;
                    case "Char":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Character>) linkedList).removeAt(index);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Character>) linkedList).removeAt(index);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Character>) linkedList).removeAt(index);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
                visualizeList();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(f, "Input does not match the selected data type.");
            } catch (ClassCastException ex) {
                JOptionPane.showMessageDialog(f, "List type mismatch.");
            }
        });
        removeLast.setBounds(855, 145, 150, 40);
        removeLast.setBackground(Color.RED);
        removeLast.addActionListener(e -> {
            try {
                switch (currentDataType) {
                    case "Integer":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Integer>) linkedList).removeLast();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Integer>) linkedList).removeLast();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Integer>) linkedList).removeLast();
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<String>) linkedList).removeLast();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<String>) linkedList).removeLast();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<String>) linkedList).removeLast();
                        }
                        break;
                    case "Double":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Double>) linkedList).removeLast();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Double>) linkedList).removeLast();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Double>) linkedList).removeLast();
                        }
                        break;
                    case "Char":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Character>) linkedList).removeLast();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Character>) linkedList).removeLast();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Character>) linkedList).removeLast();
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
                visualizeList();
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            } 
        });

        element1.setBounds(1050, 40, 150, 30);
        element1.setForeground(Color.MAGENTA);
        element1.setFont(new Font("Monospaced", Font.PLAIN, 16));
        selectedElement1.setBounds(1050, 75, 150, 20);
        element2.setBounds(1050, 100, 150, 30);
        element2.setForeground(Color.MAGENTA);
        element2.setFont(new Font("Monospaced", Font.PLAIN, 16));
        selectedElement2.setBounds(1050, 135, 150, 20);
        Swap.setBounds(1050, 160, 150, 40);
        Swap.setBackground(Color.MAGENTA);
        Swap.addActionListener(e -> {
            String input = selectedElement1.getText();
            String input2 = selectedElement2.getText();
            Integer index1 = Integer.parseInt(input);
            Integer index2 = Integer.parseInt(input2);
            int listSize = 0;

            if (input.isEmpty()) {
                JOptionPane.showMessageDialog(f, "Input is empty.");
                return;
            }

            if (linkedList == null) {
                JOptionPane.showMessageDialog(f, "Please select a list type and data type.");
                return;
            }

            try {
                switch (currentDataType) {
                    case "Integer":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Integer>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Integer>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Integer>) linkedList).size();
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<String>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<String>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<String>) linkedList).size();
                        }
                        break;
                    case "Double":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Double>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Double>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Double>) linkedList).size();
                        }
                        break;
                    case "Char":
                        if (linkedList instanceof SingleLinkedList1) {
                            listSize = ((SingleLinkedList1<Character>) linkedList).size();
                        } else if (linkedList instanceof SingleLinkedList2) {
                            listSize = ((SingleLinkedList2<Character>) linkedList).size();
                        } else if (linkedList instanceof DoubleLinkedList) {
                            listSize = ((DoubleLinkedList<Character>) linkedList).size();
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }

                if (index2 < 0 || index2 < 0) {
                    JOptionPane.showMessageDialog(f, "One of the selected indexes is out of bounds");
                    return; 
                }

                if (index1 >= listSize || index2 >= listSize) {
                    JOptionPane.showMessageDialog(f, "One of the selected indexes is out of bounds");
                }

                switch (currentDataType) {
                    case "Integer":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Integer>) linkedList).swap(index1, index2);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Integer>) linkedList).swap(index1, index2);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Integer>) linkedList).swap(index1, index2);
                        }
                        break;
                    case "String":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<String>) linkedList).swap(index1, index2);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<String>) linkedList).swap(index1, index2);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<String>) linkedList).swap(index1, index2);
                        }
                        break;
                    case "Double":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Double>) linkedList).swap(index1, index2);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Double>) linkedList).swap(index1, index2);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Double>) linkedList).swap(index1, index2);
                        }
                        break;
                    case "Char":
                        if (linkedList instanceof SingleLinkedList1) {
                            ((SingleLinkedList1<Character>) linkedList).swap(index1, index2);
                        } else if (linkedList instanceof SingleLinkedList2) {
                            ((SingleLinkedList2<Character>) linkedList).swap(index1, index2);
                        } else if (linkedList instanceof DoubleLinkedList) {
                            ((DoubleLinkedList<Character>) linkedList).swap(index1, index2);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported data type.");
                }
                visualizeList();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(f, "Input does not match the selected data type.");
            } catch (ClassCastException ex) {
                JOptionPane.showMessageDialog(f, "List type mismatch.");
            }
        });
        getElemenmtLabel.setBounds(1205, 40, 150, 30);
        getElemenmtLabel.setForeground(Color.MAGENTA);
        getElemenmtLabel.setFont(new Font("Monospaced", Font.PLAIN, 16));
        getElement.setBounds(1205, 75, 150, 20);
        get.setBounds(1205, 100, 150, 40);
        get.setBackground(Color.MAGENTA);
        Sort.setBounds(1205, 145, 150, 40);
        Sort.setBackground(Color.MAGENTA);
        Sort.addActionListener(e -> {
            if (linkedList == null) {
                JOptionPane.showMessageDialog(f, "Please add something to the list");
                return;
            }
            Comparator<Integer> intComp = Integer::compare;
            Comparator<String> stringComp = String::compareTo;
            Comparator<Double> doubleComp = Double::compare;
            Comparator<Character> charComp = Character::compareTo;

            switch (currentDataType) {
                case "Integer":
                    if (linkedList instanceof SingleLinkedList1) {
                        ((SingleLinkedList1<Integer>) linkedList).Sort(intComp);
                    } else if (linkedList instanceof SingleLinkedList2) {
                        ((SingleLinkedList2<Integer>) linkedList).Sort(intComp);
                    } else if (linkedList instanceof DoubleLinkedList) {
                        ((DoubleLinkedList<Integer>) linkedList).Sort(intComp);
                    }
                    break;
                case "String":
                    if (linkedList instanceof SingleLinkedList1) {
                        ((SingleLinkedList1<String>) linkedList).Sort(stringComp);
                    } else if (linkedList instanceof SingleLinkedList2) {
                        ((SingleLinkedList2<String>) linkedList).Sort(stringComp);
                    } else if (linkedList instanceof DoubleLinkedList) {
                        ((DoubleLinkedList<String>) linkedList).Sort(stringComp);
                    }
                    break;
                case "Double":
                    if (linkedList instanceof SingleLinkedList1) {
                        ((SingleLinkedList1<Double>) linkedList).Sort(doubleComp);
                    } else if (linkedList instanceof SingleLinkedList2) {
                        ((SingleLinkedList2<Double>) linkedList).Sort(doubleComp);
                    } else if (linkedList instanceof DoubleLinkedList) {
                        ((DoubleLinkedList<Double>) linkedList).Sort(doubleComp);
                    }
                    break;
                case "Char":
                    if (linkedList instanceof SingleLinkedList1) {
                        ((SingleLinkedList1<Character>) linkedList).Sort(charComp);
                    } else if (linkedList instanceof SingleLinkedList2) {
                        ((SingleLinkedList2<Character>) linkedList).Sort(charComp);
                    } else if (linkedList instanceof DoubleLinkedList) {
                        ((DoubleLinkedList<Character>) linkedList).Sort(charComp);
                    }
                    break;
                default:
            }
            visualizeList();
        });

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
        optionBar.add(elementToBeAdded);
        optionBar.add(toBeAdded);
        optionBar.add(addFirst);
        optionBar.add(addLast);
        optionBar.add(indexToBeAdded);
        optionBar.add(addIndex);
        optionBar.add(add);
        optionBar.add(elementToBeRemoved);
        optionBar.add(toBeRemoved);
        optionBar.add(remove);
        optionBar.add(removeFirst);
        optionBar.add(indexToBeRemoved);
        optionBar.add(removeIndex);
        optionBar.add(removeAt);
        optionBar.add(removeLast);
        optionBar.add(element1);
        optionBar.add(selectedElement1);
        optionBar.add(element2);
        optionBar.add(selectedElement2);
        optionBar.add(Swap);
        optionBar.add(getElemenmtLabel);
        optionBar.add(getElement);
        optionBar.add(get);
        optionBar.add(Sort);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(field);
        f.add(optionBar);
        f.setLayout(null);
        f.setSize(1920, 960);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void createList() {
        String chosenListType = (String) listType.getSelectedItem();
        currentDataType = (String) dataType.getSelectedItem();

        switch (chosenListType) {
            case "Single Linked List":
                if (currentDataType.equals("Integer")) {
                    linkedList = new SingleLinkedList1<Integer>();
                } else if (currentDataType.equals("String")) {
                    linkedList = new SingleLinkedList1<String>();
                } else if (currentDataType.equals("Double")) {
                    linkedList = new SingleLinkedList1<Double>();
                } else if (currentDataType.equals("Char")) {
                    linkedList = new SingleLinkedList1<Character>();
                }
                break;
            case "Cirkular Linked List":
                if (currentDataType.equals("Integer")) {
                    linkedList = new SingleLinkedList2<Integer>();
                } else if (currentDataType.equals("String")) {
                    linkedList = new SingleLinkedList2<String>();
                } else if (currentDataType.equals("Double")) {
                    linkedList = new SingleLinkedList2<Double>();
                } else if (currentDataType.equals("Char")) {
                    linkedList = new SingleLinkedList2<Character>();
                }
                break;
            case "Double Linked List":
                if (currentDataType.equals("Integer")) {
                    linkedList = new DoubleLinkedList<Integer>();
                } else if (currentDataType.equals("String")) {
                    linkedList = new DoubleLinkedList<String>();
                } else if (currentDataType.equals("Double")) {
                    linkedList = new DoubleLinkedList<Double>();
                } else if (currentDataType.equals("Char")) {
                    linkedList = new DoubleLinkedList<Character>();
                }
                break;
            default:
                JOptionPane.showMessageDialog(f, "Invalid list type selected.");
                break;
        }
    }

    public void visualizeList() {
        ArrayList<?> listData = new ArrayList<>();

        if (linkedList instanceof SingleLinkedList1) {
            listData = ((SingleLinkedList1<?>) linkedList).getList();
        } else if (linkedList instanceof SingleLinkedList2) {
            listData = ((SingleLinkedList2<?>) linkedList).getList();
        } else if (linkedList instanceof DoubleLinkedList) {
            listData = ((DoubleLinkedList<?>) linkedList).getList();
        }

        ((ListPanel) field).setListData(listData);
    }

    private class ListPanel extends JPanel {
        private ArrayList<?> listData;

        public void setListData(ArrayList<?> listData) {
            this.listData = listData;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (listData == null || listData.isEmpty()) {
                return; 
            }

            int x = 50; 
            int y = 355;
            int nodeDiameter = 50; 
            int spacing = 80;

            g.setColor(Color.GREEN); 
            FontMetrics fm = g.getFontMetrics();

            for (int i = 0; i < listData.size(); i++) {
                g.drawOval(x, y, nodeDiameter, nodeDiameter);

                String nodeValue = listData.get(i).toString();
                int textWidth = fm.stringWidth(nodeValue);
                int textHeight = fm.getAscent();
                g.drawString(nodeValue, x + (nodeDiameter - textWidth) / 2, y + (nodeDiameter + textHeight) / 2 - 5);

                if (i < listData.size() - 1) {
                    int arrowXStart = x + nodeDiameter;
                    int arrowXEnd = x + spacing; 
                    int arrowY = y + nodeDiameter / 2;

                    g.drawLine(arrowXStart, arrowY, arrowXEnd, arrowY);
                    g.drawLine(arrowXEnd - 10, arrowY - 5, arrowXEnd, arrowY); 
                    g.drawLine(arrowXEnd - 10, arrowY + 5, arrowXEnd, arrowY); 
                }

                if (linkedList instanceof DoubleLinkedList && i > 0) {
                    int arrowXEnd = x;  
                    int arrowXStart = x - spacing;  
                    int arrowY = y + nodeDiameter / 2 + 10;  
        
                    g.drawLine(arrowXStart + nodeDiameter, arrowY, arrowXEnd, arrowY);
                    g.drawLine(arrowXStart + nodeDiameter + 10, arrowY - 5, arrowXStart + nodeDiameter, arrowY); 
                    g.drawLine(arrowXStart + nodeDiameter + 10, arrowY + 5, arrowXStart + nodeDiameter, arrowY); 
                }
                x += spacing;
            }

            if (linkedList instanceof SingleLinkedList2) {
                int lastX = x - spacing;  
                int firstX = 50; 
                int lastYBottom = y + nodeDiameter; 
                int firstYBottom = y + nodeDiameter;  
        
                g.drawLine(lastX + nodeDiameter / 2, lastYBottom, lastX + nodeDiameter / 2, lastYBottom + 50); 
                g.drawLine(lastX + nodeDiameter / 2, lastYBottom + 50, firstX + nodeDiameter / 2, firstYBottom + 50); 
                g.drawLine(firstX + nodeDiameter / 2, firstYBottom + 50, firstX + nodeDiameter / 2, firstYBottom); 
                g.drawLine(firstX + nodeDiameter / 2 - 5, firstYBottom + 10, firstX + nodeDiameter / 2, firstYBottom); 
                g.drawLine(firstX + nodeDiameter / 2 + 5, firstYBottom + 10, firstX + nodeDiameter / 2, firstYBottom);  
            }
        }
    }
}
