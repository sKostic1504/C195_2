package Model;

public class Appointment {

    private int AppointmentID;
    private String title;
    private String description;
    private String location;
    private String type;

    public Appointment(int appointmentID, String title, String description, String location, String type) {
        AppointmentID = appointmentID;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
    }

    public int getAppointmentID() {
        return AppointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        AppointmentID = appointmentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
