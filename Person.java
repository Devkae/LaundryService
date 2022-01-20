class Person {
    //Declaration
    private String pname, paddress,pid;
    private int pcontact;
    private double pcharge;
    private Event ev;
    private String duration;
    //default constructor
    public Person()
    {
        this.pname=pname;
        this.paddress=paddress;
        this.pcontact=pcontact;
        this.pid = pid;
        this.ev = ev; 
    }
    //normal constructor
    public Person(String pname, String paddress, int pcontact,String pid,Event ev)
    {
        this.pname=pname;
        this.paddress=paddress;
        this.pcontact=pcontact;
        this.pid = pid;
        this.ev = ev;
    }

    //Accessor Method
    public void setPerson(String pname,String paddress,int pcontact,String pid,Event ev)
    {
        this.pname = pname;
        this.paddress = paddress;
        this.pcontact = pcontact;
        this.pid = pid;
        this.ev = ev;
    }

    //Mutator Method
    public String getName(){return pname;}
    public String getAddress(){return paddress;}
    public int getContact(){return pcontact;}
    public Event getEvent() {return ev;}
    public String getID() {return pid;}

    //Processor Method
    public double calcTotal(double price) 
    {
        double minute = 0;
        int hour;
        
        hour = Integer.parseInt(ev.getEnd().substring(0,2)) - Integer.parseInt(ev.getStart().substring(0,2));
        minute = Double.parseDouble(ev.getStart().substring(2,4)) - Double.parseDouble(ev.getEnd().substring(2,4));
        if (minute<0)
        minute=(-1*minute);
        duration = hour + " hour " + minute + " minute ";
        minute/=60;
        pcharge=(price*hour)+(price*minute);
        return pcharge;
    }
    //display method       
    public void display()
    {
        System.out.println("Name : "+pname+"\nIC Number/ID: "+pid+"\nAddress: "+paddress+"\nContact Number: +60"+pcontact);
        System.out.println(ev.toString());
        System.out.println("Usage hour: "+duration+"\nBooking charge:RM"+pcharge);
    }

}