package Model;

public class Shift {
    private  String ID;
    private  String days;
    private String session;


    public Shift(String ID, String days, String session) {
        this.ID = ID;
        this.days = days;
        this.session = session;
    }

    public Shift() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return "Shift{" +
                "ID=" + ID +
                ", days='" + days + '\'' +
                ", session='" + session + '\'' +
                '}';
    }
}
