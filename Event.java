import java.util.Scanner;
class Event {
    //Declaration
    private String ename,evenue,edate,estart,eend;
    //default constructor
    public Event()
    {
        ename=" ";
        evenue=" ";
        edate=" ";
        estart=" ";
        eend=" ";
    }
    //normal constructor
    public Event(String ename, String evenue, String edate, String estart, String eend)
    {
        this.ename=ename;
        this.evenue=evenue;
        this.edate=edate;
        this.estart=estart;
        this.eend=eend;
    }
    
    //Accessor Method
    public void setEvent(String ename, String evenue, String edate, String estart, String eend)
    {
        this.ename=ename;
        this.evenue=evenue;
        this.edate=edate;
        this.estart=estart;
        this.eend=eend;
    }

    //Mutator Method
    public String getEventName(){return ename;}
    public String getVenue(){return evenue;}
    public String getDate(){return edate;}
    public String getStart(){return estart;}
    public String getEnd(){return eend;}
    //display method
    public String toString(){
        return ("Event Name : " + ename +"\nVenue: "+ evenue +"\nDate :" + edate + "\nBooking time (starting) : " + estart + "\nBooking time (ending) : " + eend);
    }
}