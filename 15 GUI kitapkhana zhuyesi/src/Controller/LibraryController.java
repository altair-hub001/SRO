package controller;

import model.Book;
import model.Library;
import view.LibraryGUI;

public class LibraryController {
    private Library library;
    private LibraryGUI gui;

    public LibraryController(Library library, LibraryGUI gui) {
        this.library = library;
        this.gui = gui;

        gui.addButton.addActionListener(e -> addBook());
        gui.deleteButton.addActionListener(e -> deleteBook());
    }

    private void addBook() {
        String title = gui.titleField.getText();
        String author = gui.authorField.getText();
        int year;

        try {
            year = Integer.parseInt(gui.yearField.getText());
        } catch (Exception e) {
            return;
        }

        Book book = new Book(title, author, year);
        library.addBook(book);

        gui.tableModel.addRow(new Object[]{title, author, year});
    }

    private void deleteBook() {
        int selectedRow = gui.table.getSelectedRow();
        if (selectedRow >= 0) {
            library.removeBook(selectedRow);
            gui.tableModel.removeRow(selectedRow);
        }
    }
}