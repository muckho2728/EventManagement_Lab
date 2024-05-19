//single linked list for event. It is a subclass of the SLL class
package Model;

import View.Event;
import java.awt.BorderLayout;
import java.util.Scanner;

public class EventList extends SLL {
    Scanner sc = null;
    
    public EventList() {
        super();
        sc = new Scanner(System.in);
    }
    //Find an event with a known eventID - Linear search - Validation
    private SLL_Node<Event> find (int eventID) {
        SLL_Node<Event> ref;
        for (ref = this.getHead(); ref != null; ref = ref.next)
            if (ref.info.getEventID()== eventID) {
                return ref;
            } else {
            }
        return null;
    }
    
    //Add a new event to the list
    public void add(){
        String eventName=" ", location=" ", startDate="", endDate="", status="" ; int eventID = 0;  
        System.out.println("Add new event!");
        boolean proceed = false;
        //enter eventID
        do{
            System.out.println("Enter event ID");
            eventID = sc.nextInt();
            proceed = find(eventID) != null;
            if (proceed == true) System.out.println("This event ID is duplicated!");
        }while (proceed);
        //enter eventName
        do{
            System.out.println("Enter event Name!");
            eventName =sc.nextLine().toUpperCase();
            proceed = find(eventName) != null;
            if (proceed == true) System.out.println("This event must be inpputed!");
        }while(proceed);
        
        //Enter startDate
        do{
            System.out.println("Enter day start event !");
            startDate=sc.nextLine().toUpperCase();
            proceed = find(eventID) != null;
            if (proceed == true) System.out.println("This event is duplicated!");
        }while(proceed);
        
        //Enter endDate
        do{
            System.out.println("Enter day start event !");
            startDate=sc.nextLine().toUpperCase();
            proceed = find(eventID) != null;
            if (proceed == true) System.out.println("This event is duplicated!");
        }while(proceed);
}    
    
    // Remove an event from list
    public void remove(){
        if (this.isEmpty()) System.out.println("The list is empty!");
        else{
            String eventID="";
            System.out.println("Enter the eventID of event you want be removed!");
            eventID=sc.nextLine().toUpperCase();
            SLL_Node<Event> ref = (SLL_Node<Event>) find(eventID);
            if (ref==null) System.out.println("Event is not exist!");
            else{
                this.delete(ref.info);
                System.out.println("This event has been removed!");
            }
        }
    }
    // Increasing the startDate of an event
    public void increstaDate() {
    if (this.isEmpty()) {
        System.out.println("The list is empty!");
        return;
    }

    String eventID;
    System.out.println("Enter the eventID of the event you want to promote:");
    eventID = sc.nextLine().toUpperCase();

    SLL_Node<Event> ref = (SLL_Node<Event>) find(eventID);
    if (ref == null) {
        System.out.println("Start Date does not exist!");
    } else {
        String oldStaDate = ref.info.getStarDate();
        String newStaDate;
        do {
            System.out.print("Old Start Date: " + oldStaDate + " -> New Start Date: ");
            newStaDate = sc.nextLine();
        } while (!newStaDate.equals(oldStaDate));

        ref.info.setStarDate(newStaDate);
        System.out.println("Start Date has been updated!");
    }
}
//    public void increstaDate(){
//        if (this.isEmpty()) System.out.println("The list is empty!");
//        else{
//            String eventID="";
//            System.out.println("Enter the eventID of event you want be promoted!");
//            eventID= sc.nextLine().toUpperCase();
//            SLL_Node<Event> ref= find(eventID);
//            if (ref == null) System.out.println("Start Date is not exist!");
//            else{
//                String oldStaDate = ref.info.getStarDate();
//                String newStaDate;
//                do{
//                    System.out.println("Old Start Date: "+ oldStaDate + "-> New Start Date: ");
//                    newStaDate = String.copyValueOf(sc.nextLine());
//                }while (newStaDate != oldStaDate);
//                ref.info.setStarDate(newStaDate);
//                System.out.println("Start Date has been updated!");
//            }
//        }
//    }
    
    public void print(){
        if(this.isEmpty()) System.out.println("The list is Empty!");
        else{
            System.out.println("EVENT LIST");
            this.printAll();
        }
    }// EventList
   
//    public void createEvent(String name, String location) {
//        event.add(new Event(name, location));
//    }
//    
//    public boolean checkEventExits(String name) {
//        for (Event envent : event ) {
//            if (event.getName().equals(name)){
//                return true;
//            }
//        }
//        return false;
//    }
//    
//    public Event searchEventByLocation(String location) {
//        for (Event event : events) {
//            if (event.getLocation().equals(location)) {
//                return events;
//            }
//        }
//        return null;
//    }
//    
//    public void updateEventDetails(String name, String newName, String newLocation) {
//        for (Event event : events) {
//            if (event.getName().equals(name)){
//                event.setName(newName);
//                event.setLocation(newLocation);
//            }
//        }
//    }
//    
//    public void deleteEvent(String name) {
//        events.removeIf(event -> event.getName().equals(name));
//    }
//    
//    public void saveEventsToFile() {
//        try {
//            FileOutputStream fos = new FileOutputStream("events.dat");
//            ObjectOutputStream oos = new ObjectOutputStream oos = newObjectOutputStream(fos);
//            oos.writeObject(events);
//            oos.close();
//            fos.close();
//        }catch(IOExeception ioe){
//            ioe.printStackTrace();
//        }
//    }
//    
//    public ArrayList<Event>getEvents() {
//        return events;
//    }

    private Object find(String eventID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void increaseDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
