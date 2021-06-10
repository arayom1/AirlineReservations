package assignment3;

import java.util.Scanner;

/*
(Airline Reservations System) A small airline has just purchased a computer for its 
new automated reservations system. You’ve been asked to develop the new system. You’re to write an 
application to assign seats on each flight of the airline’s only plane (capacity: 10 seats). Your 
application should display the following alternatives: Please type 1 for First Class and Please type 
2 for Economy. If the user types 1, your application should assign a seat in the firstclass section 
(seats 1–5). If the user types 2, your application should assign a seat in the economy section 
(seats 6–10). Your application should then display a boarding pass indicating the person’s seat number 
and whether it’s in the first-class or economy section of the plane. Use a one-dimensional array of 
primitive type boolean to represent the seating chart of the plane. Initialize all the elements of the 
array to false to indicate that all the seats are empty. As each seat is assigned, set the corresponding 
element of the array to true to indicate that the seat is no longer available. Your application should 
never assign a seat that has already been assigned. When the economy section is full, your application 
should ask the person if it’s acceptable to be placed in the first-class section (and vice versa). If yes, 
make the appropriate seat assignment. If no, display the message "Next flight leaves in 3 hours."
*/

public class AirlineReservations {
	//main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		int countFirst = 0;
		int countEco = 5;
		boolean[] planeSeats = new boolean[]{false, false, false, false, false, false, false, false, false, false};
		
		System.out.println("------------------------------------------");
		System.out.println("Welcome to the Airline Reservations System");
		System.out.println("------------------------------------------");
		//while loop
		while(true) {
			System.out.println("Please type \n 1 to reserve first class seat or \n 2 to reserve economy class seat or \n-1 to exit \n");
			choice = input.nextInt();
			if(choice == 1) {
				if (countFirst < 5) {
					planeSeats[countFirst] = true;
					System.out.println("--------------------------------------------");
					System.out.println("You Successfully resereved your seat!");
					System.out.println("============================================");
					System.out.println("BOARDING PASS");
					System.out.println("Section: First-class & Seat number:" + (countFirst+1));
					System.out.println("============================================");
					countFirst++;
				}else if(countFirst > 4){
					char option;
					System.out.println("-------------------------------------------------------");
					System.out.println("This section is full.");
					System.out.println("Do you want to placed in economy class?\n (press(Y or N)): ");
					option = input.next().charAt(0);	
					if(option == 121 || option == 89) {
						if (countEco < 10) {
							planeSeats[countEco] = true;
							System.out.println("-------------------------------------------");
							System.out.println("You Successfully resereved your seat!");
							System.out.println("============================================");
							System.out.println("BOARDING PASS");
							System.out.println("Class: Economy & Seat number:" + (countEco+1));
							System.out.println("============================================");
							countEco++;
						}else{
							System.out.println("-----------------------------------------------------");
							System.out.println("Economy class is full. Next flight leaves in 3 hours.");
							System.out.println("-----------------------------------------------------");
						}
					}else if(option == 110 || option == 78){
						System.out.println("------------------------------");
						System.out.println("Next flight leaves in 3 hours.");
						System.out.println("------------------------------");
					}else {
						System.out.println("-----------------------");
						System.out.println("Wrong Input! try again!");
						System.out.println("-----------------------");
					}
				}
			}
			else if(choice == 2) {
				if (countEco < 10) {
					planeSeats[countEco] = true;
					System.out.println("-------------------------------------------");
					System.out.println("You Successfully resereved your seat!");
					System.out.println("============================================");
					System.out.println("BOARDING PASS");
					System.out.println("Class: Economy & Seat number:" + (countEco+1));
					System.out.println("============================================");
					countEco++;
				}else if(countEco > 9){
					char option;
					System.out.println("-------------------------------------------------------");
					System.out.println("This section is full.");
					System.out.println("Do you want to placed in first class?\n (press(Y or N)): ");
					option = input.next().charAt(0);	
					if(option == 121 || option == 89) {
						if (countFirst < 5) {
							planeSeats[countFirst] = true;
							System.out.println("-------------------------------------------");
							System.out.println("You Successfully resereved your seat!");
							System.out.println("============================================");
							System.out.println("BOARDING PASS");
							System.out.println("Class: First & Seat number:" + (countFirst+1));
							System.out.println("============================================");
							countFirst++;
						}else{
							System.out.println("---------------------------------------------------");
							System.out.println("First class is full. Next flight leaves in 3 hours.");
							System.out.println("---------------------------------------------------");
						}
					}else if(option == 110 || option == 78){
						System.out.println("------------------------------");
						System.out.println("Next flight leaves in 3 hours.");
						System.out.println("------------------------------");
					}else {
						System.out.println("-----------------------");
						System.out.println("Wrong Input! try again!");
						System.out.println("-----------------------");
					}
				}
			}else if(choice == -1){
				System.out.println("--------------------------------");
				System.out.println("Thank you for using our system!!");
				System.out.println("--------------------------------");
				break;
			}else {
				System.out.println("--------------------------");
				System.out.println("You entered wrong number!!");
				System.out.println("--------------------------");
			}		
		}
	}
}
