package PBLJ_Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Note {
    private String title;
    private String content;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}

public class NotesKeeperApp {
    private static List<Note> notes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Notes Keeper App");
            System.out.println("1. Add a note");
            System.out.println("2. View notes");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting Notes Keeper App. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static void addNote() {
        System.out.print("Enter the title for your note: ");
        String title = scanner.nextLine();
        System.out.print("Enter the content of your note: ");
        String content = scanner.nextLine();
        Note note = new Note(title, content);
        notes.add(note);
        System.out.println("PBLJ_Projects.Note added successfully.");
    }

    private static void viewNotes() {
        System.out.println("Your notes:");
        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            System.out.println("PBLJ_Projects.Note " + (i + 1) + ":");
            System.out.println("Title: " + note.getTitle());
            System.out.println("Content: " + note.getContent());
        }
    }
}
