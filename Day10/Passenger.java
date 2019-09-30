import  java.util.Scanner;
public class Passenger {
	Scanner sc = new Scanner(System.in);
String pnrNumber;
String mobileNumber;
String passengerName;
int fare;
int cgst=100;
int sgst=100;
public void bookTicket()
{
	
	pnrNumber ="19383737";
	mobileNumber="9999999999";
	passengerName="Ayesha";
	fare= 7800+cgst+sgst;
	System.out.println(passengerName+" your ticket booked successfully");
	System.out.println(mobileNumber+" is recorded too");
	System.out.println("Your total fare is :"+fare);
}
public void cancelTicket()
{
	pnrNumber ="19383738";
	mobileNumber="9999999999";
	passengerName="Saif";
	fare= 2300+cgst+sgst;
	System.out.println(passengerName+" your ticket cancelled successfully");
	System.out.println(mobileNumber+" is recorded too");
	System.out.println("Your total fare is :"+fare);
}
public static void main(String args[]) {
	Passenger passenger= new Passenger();
	passenger.bookTicket();
	System.out.println("###########################");
	passenger.cancelTicket();
}
}
