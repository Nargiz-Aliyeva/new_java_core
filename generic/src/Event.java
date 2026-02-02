public class Event <T> extends Human{
private T attendance;
private String type;

    public Event(T attendance, String type) {
        super();
        this.attendance = attendance;
        this.type = type;
    }

    public Event() {

    }

    public T getAttendance() {
        return attendance;
    }

    public void setAttendance(T attendance) {
        this.attendance = attendance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Event{" +
                "attendance=" + getAttendance() +
                ", type='" + getType() + '\'' +
                '}';
    }
}
