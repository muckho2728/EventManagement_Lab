package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Menu extends ArrayList<String> {

    protected String title;
    protected List<String> services = new ArrayList<>();

    public Menu(String title, List<String> services) {
        this.title = title;
        this.services = services;
    }

    public void display() {
        System.out.println(title);
        for (int i = 0; i < services.size(); i++) {
            System.out.println((i + 1) + ". " + services.get(i));
        }
    }

    public int getChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter selection: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public abstract void execute(int choice);

    public void run() {
        int choice;
        do {
            display();
            choice = getChoice();
            execute(choice);
        } while (choice != services.size());

    }

    public int getUserChoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
