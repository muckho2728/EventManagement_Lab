package Model;

import View.Menu;

public class Event_Program {
    
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.add("Add new event");
        menu.add("Remove an event");
        menu.add("Increase Date of an event");
        menu.add("Print event list");
        menu.add("Quit!!!");
        EventList eventList = new EventList();
        int userChoice;
        do{
            userChoice= menu.getUserChoice();
            switch(userChoice){
                case 1: eventList.add();break;
                case 2: eventList.remove();break;
                case 3: eventList.increstaDate(); break;
                case 4: eventList.print(); break;
            }
        }
        while (userChoice>0 && userChoice<5);
    }
}
