package Model;

public class ListEvent {
    private ArrayList<Event> events;
    
    public ListEvent() {
        events = new ArrayList<>();
    }
    
    public void createEvent(String name, String location) {
        events.add(new Event(name, location));
    }
    
    public boolean checkEventExits(String name) {
        for (Event envent : events ) {
            if (event.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    
    public Event searchEventByLocation(String location) {
        for (Event event : events) {
            if (event.getLocation().equals(location)) {
                return events;
            }
        }
        return null;
    }
    
    public void updateEventDetails(String name, String newName, String newLocation) {
        for (Event event : events) {
            if (event.getName().equals(name)){
                event.setName(newName);
                event.setLocation(newLocation);
            }
        }
    }
    
    public void deleteEvent(String name) {
        events.removeIf(event -> event.getName().equals(name));
    }
    
    public void saveEventsToFile() {
        try {
            FileOutputStream fos = new FileOutputStream("events.dat");
            ObjectOutputStream oos = new ObjectOutputStream oos = newObjectOutputStream(fos);
            oos.writeObject(events);
            oos.close();
            fos.close();
        }catch(IOExeception ioe){
            ioe.printStackTrace();
        }
    }
    
    public ArrayList<Event>getEvents() {
        return events;
    }
}
