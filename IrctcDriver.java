
import java.util.ArrayList;
import java.util.Scanner;
class Tickets 
{
  int ticketsNo ;
  String boardings;
  String destination;
  String passengername;
  long passengercno;
Tickets(int ticketsNo, String boardings,String destination, String passengername,long passengercno)
{
	this.ticketsNo = ticketsNo;
    this.boardings = boardings;
    this.destination = destination;
    this.passengername = passengername;
    this. passengercno =  passengercno;
}
public String toString()
{
	return "Tickets number is " + ticketsNo + "\n Boarding point is " + boardings + "\n Destination is " + destination;
}
}

class Irctc
{
  Tickets t;
  static String railways = "Indian Railways";
  ArrayList<Tickets> al = new ArrayList<>();

public void bookTicket(Tickets t)
{
	if (this.t == null)
	{
     al.add(t);
    System.out.println("Ticket is booked succesfully");
	}
else {
	 System.out.println("Ticket is already booked ");
}
}
public void updateTicket(int ticketsNo,String boardings,String destination)
{
	for (Tickets t : al)
	{
      if (t.ticketsNo == ticketsNo)
      {
        t.boardings = boardings;
        t.destination = destination;
       System.out.println("Both boardings and destination ara changed ");
       return ;
      }
  else {
	System.out.println("No ticket is found");
    return;
  }
	}
System.out.println("Ticket is Not booked to update");
}
public void ticketDetails(int ticketsNo)
{
	for(Tickets t : al)
{
	if (t.ticketsNo == ticketsNo)
	{
      System.out.println(t.toString());
       return ;
	}
else {
	System.out.println("No ticket found");
   return ;
}
}
System.out.println(" Ticket is not booked to show ticket Details");
}
public void cancelTicket(int ticketsNo)
{
	for(Tickets t : al)
{
	if (t.ticketsNo == ticketsNo)
	{
      al.remove(t);
      System.out.println("Ticket is removed");
      return;
	}
   else {
	System.out.println("No ticket found");
   return;
   }
}
System.out.println(" Ticket is not booked to cancel Ticket");
 
}
public void updateBoarding(int ticketsNo,String boardings)
{
for(Tickets t : al)
{
	if (t.ticketsNo == ticketsNo)
	{
       t.boardings = boardings;
     System.out.println("Boarding point is updated");
    return;
	}
else {
	System.out.println("No ticket found");
   return;
}
}	
System.out.println(" Ticket is not booked to update boarding point ");
}

public void updateDestination(int ticketsNo,String destination)
{
for(Tickets t : al)
 {
	if (t.ticketsNo == ticketsNo)
   {
	t.destination = destination;
    System.out.println(" Destination  is updated");
    return;
   }
else {
	System.out.println("No ticket found");
   return;
}
 }	
System.out.println(" Ticket is not booked to update Destination ");
}
}
class IrctcDriver
{
 public static void main (String[] args)
{
 Scanner sc = new Scanner (System.in);
  Irctc i = new Irctc();
   boolean exit = true;
 while (exit)
 {
  System.out.println(" Enter your choice \n1.Book Ticket \n2.Update Ticket \n3.Ticket Details "+ "\n4.CncelTicket \n5.Exit");

  int choice = sc.nextInt();
 switch(choice)
{
	case 1 : {
		System.out.println("Enter Ticket Number");
        int ticketsNo = sc.nextInt();
        
       System.out.println("Enter boarding point");
        String boardings = sc.next();
      
       System.out.println("Enter Destination ");
        String destination = sc.next();
       System.out.println("Enter Passenger name ");
    String passengername = sc.nextLine();
    passengername = sc.nextLine();
  
    System.out.println("Enter Contact number");
   long passengercno = sc.nextLong();
   i.bookTicket(new Tickets(ticketsNo,boardings,destination,passengername,passengercno));
	}
break;
case 2 :{
	System.out.println("Enter Ticket Number");
        int ticketsNo = sc.nextInt();
   System.out.println(" Enter your choice \n1.Boarding \n2.Destination \n3.Boarding and Destination ");
  int choice1 = sc.nextInt();
  switch(choice1) {
	case 1: {
		 System.out.println("Enter boarding point");
        String boardings = sc.next();
       i.updateBoarding(ticketsNo,boardings);

	}
 break ;
case 2 : {
	  System.out.println("Enter your destination");
        String destination = sc.next();
     i.updateDestination(ticketsNo,destination);
   
}  
break ;
 case 3:{
	 System.out.println("Enter boarding point");
        String boardings = sc.next();
     System.out.println("Enter boarding point");
        String destination = sc.next();
     i.updateTicket(ticketsNo,boardings,destination);
 }     
break ;
default : {
	System.out.println("Invalid choice !");

}
break ;
  }
}
break ;
case 3 :{
	System.out.println("Enter Ticket Number");
        int ticketsNo = sc.nextInt();
         i.ticketDetails(ticketsNo);
}
break ;
case 4: {
	System.out.println("Enter Ticket Number");
        int ticketsNo = sc.nextInt();
    i.cancelTicket(ticketsNo);
}
break ;
case 5 :{
	exit = false;
}
break;
default :
{
	System.out.println("Invalid choice !");
}
break;
}
 }

}
}
