package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class LibraryGUI extends JFrame {
    public JTextField titleField = new JTextField(10);
    public JTextField authorField = new JTextField(10);
    public JTextField yearField = new JTextField(5);

    public JButton addButton = new JButton("Қосу");
    public JButton deleteButton = new JButton("Жою");

    public DefaultTableModel tableModel = new DefaultTableModel(
            new Object[]{"Атауы", "Автор", "Жылы"}, 0
    );

    public JTable table = new JTable(tableModel);

    public LibraryGUI() {
        setTitle("Кітапхана жүйесі");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Атауы:"));
        panel.add(titleField);
        panel.add(new JLabel("Автор:"));
        panel.add(authorField);
        panel.add(new JLabel("Жылы:"));
        panel.add(yearField);
        panel.add(addButton);
        panel.add(deleteButton);

        add(panel, "North");
        add(new JScrollPane(table), "Center");

        setVisible(true);
    }
}