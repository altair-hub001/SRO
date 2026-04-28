import controller.LibraryController;
import model.Library;
import view.LibraryGUI;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryGUI gui = new LibraryGUI();
        new LibraryController(library, gui);
    }
}