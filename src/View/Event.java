package View;

public class Event {
    private int eventID;
    private String eventName;
    private String location;
    private String starDate;
    private String endDate;
    private String status;

    public Event() {
    }

    public Event(int eventID, String eventName, String location, String starDate, String endDate, String status) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.location = location;
        this.starDate = starDate;
        this.endDate = endDate;
        this.status = status;
    }
    
    public Event(String eventName, String location, String starDate, String endDate, String status){
        this(-1, eventName, location, starDate, endDate, status);
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStarDate() {
        return starDate;
    }

    public void setStarDate(String starDate) {
        this.starDate = starDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    

   
    
    
}
