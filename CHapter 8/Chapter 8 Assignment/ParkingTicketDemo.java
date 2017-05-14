import java.util.Scanner;

import java.util.Scanner;

public class ParkingTicketDemo {



	public static void main(String[] args) 
	{
		
	
	   Scanner scanner = new Scanner(System.in);
	     
	   //Stuff for the ParkedCar
	     System.out.println("WHat is the cars make?");
	     String make = scanner.nextLine();

	     System.out.println("WHat is the cars model?");
	     String model = scanner.nextLine();
	     
	     System.out.println("WHat is the cars color?");
	     String color = scanner.nextLine();
	     
	     System.out.println("WHat is the cars licinse number");
	     double licenseNum = scanner.nextDouble();
	     
	     System.out.println("How long has it been there");
	     double hour = scanner.nextDouble();
	     
	     ParkedCar carS = new ParkedCar(make, model, color, licenseNum, hour);
	     
	     //Stuff for ParkingMeter
	     System.out.println("What is the bought time?");
	     double boughtTime = scanner.nextDouble();
	     
	     ParkingMeter parkedS = new ParkingMeter(boughtTime);

	     //Stuff for PoliceOfficer
	     System.out.println("What is the officers name?");
	     String copName = scanner.nextLine();
	     copName = scanner.nextLine();


	     System.out.println("What is the officers badge number?");
	     double badgeNum = scanner.nextDouble();
	     
	     PoliceOfficer policeS = new PoliceOfficer (copName, badgeNum);
        
        ParkingTicket parkingTT = new ParkingTicket (carS, policeS, parkedS);


        System.out.println(parkingTT);


	
	}
}
