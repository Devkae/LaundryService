import java.util.Scanner;
import java.lang.String;
class VBS{
    public static void main(String[] args){
        //Declaration
        String pname,ename,paddress,evenue=" ",edate,pid = " ",estart,eend;
        boolean status = true;
        int pcontact,count = 0,countDT = 0,countDK200 = 0,countDK300 = 0;
        double sum = 0,price = 0;
        //Scanner
        Scanner text = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);
        
        //array of object Person
        Person[] customer = new Person[20];
        //Read and store all data into the array of objects
        while((status != false) && (count <= 20)){
            System.out.println("-----------------------------------------------------");
            System.out.println("Detail for organiser\nName :");
            //System.out.println("Name : ");
            pname = text.nextLine();
            System.out.println("Address : ");
            paddress = text.nextLine();
            System.out.println("Contact Number : ");
            pcontact = num.nextInt();
            System.out.println("Identification Number[IC Number / Staff ID / Student ID]: ");
            pid= text.nextLine();

            System.out.println("-----------------------------------------------------");
            System.out.println("Event Details\nEvent Name :");
            ename = text.nextLine();
            System.out.println("Event Venue : ");
            evenue= text.nextLine();
            if(evenue.equalsIgnoreCase("DT")){
                evenue="Dewan Titiwangsa";
                price=300;
                countDT++;
            } else if(evenue.equalsIgnoreCase("DK300")){
                evenue="Dewan Kuliah 300";
                price=150;
                countDK200++;
            } else if(evenue.equalsIgnoreCase("DK200")){
                evenue="Dewan Kuliah 200";
                price=100;
                countDK300++;
            }
            System.out.println("Event Date : ");
            edate = text.nextLine();
            System.out.println("Starting hour(24 hour format) : ");
            estart = text.nextLine();
            System.out.println("End hour(24 hour format): ");
            eend = text.nextLine();
            System.out.println("----------------------------------------------------");
            
            customer[count]=new Person();
            customer[count].setPerson(pname,paddress,pcontact,pid,new Event(ename,evenue,edate,estart,eend)); //Input All the Details
            
                
            if (customer[count].getID().length()<=10)
            {price=0;
                System.out.println("Free of charge for student and staff");};
            customer[count].calcTotal(price);
            sum += customer[count].calcTotal(price);

            customer[count].display();

            count++;
            System.out.println("\nAdd new event? [True/False]");
            status = choice.nextBoolean();

        }
        
        if (count==20)
        System.out.println("Full storage . Please rerun the program");
        
        System.out.println("****************************************************");
        System.out.println("Total booked event at Dewan Titiwangsa : " + countDT);
        System.out.println("Total booked event at Dewan Kuliah 200 : " + countDK200);
        System.out.println("Total booked event at Dewan Kuliah 300 : " + countDK300);

        System.out.println("Total collection : RM" + sum);
    }
}
