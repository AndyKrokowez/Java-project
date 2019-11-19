/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Anderson do Rego
 * @author Camila Weber
 * 
 */
public class Menu 
{
    

    public void mainMenu(){}
    
    public static void started(Pilot[] Pilot, AirPlane[] Plane, ArrayList<Flight> Flight) 
    { 
    // creating menu
        String continuing="n";
	int option = 0;
	do 
        {
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|      ASSIGNMENT 2 : ANDERSON DO REGO SBS19013          |");
        System.out.println("|                     CAMILA WEBER SBS19006              |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|          AIRLINE SCHEDULE SYSTEM (CCT AIRWAYS)         |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("| 1. LIST ALL FLIGHTS                                    |");
        System.out.println("| 2. VIEW A PARTICULAR FLIGHT                            |");
        System.out.println("| 3. LIST ALL AIRCRAFT AVAILABLE                         |");
        System.out.println("| 4. VIEW A PARTICULAR AIRCRAFT                          |");
        System.out.println("| 5. VIEW ALL PILOTS                                     |");
        System.out.println("| 6. VIEW A PARTICULAR PILOT                             |");
        System.out.println("| 7. CREATE A FLIGHT                                     |");
        System.out.println("| 8. EXIT                                                |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("|                      VERSION 1.0                       |");
        System.out.println("+--------------------------------------------------------+");
        System.out.println("SELECT MENU (1-8)");
        System.out.print("-> ");


        
                Scanner sc = new Scanner(System.in);
                option = sc.nextInt();
                
                // second instance of scanner
	        Scanner sc1 = new Scanner(System.in);
                
                // logic class
                Logic logic = new Logic();
                
		System.out.print("\n");
                
                // option chosen on menu
		switch (option) 
                {
		case 1:
                {
                       // display all flights
                        System.out.println("Display all flights on the system \n");
                        
                        System.out.println("All Flights"); 
                        for(Flight all : Flight) 
                        {
                            System.out.println(all);
                        } 
                        continuing="n";
			break;
                }
                         
		case 2:
                {
                         // display a particular flight
			System.out.println("View a particular Flight\n");
                        logic.CheckFlight(Flight);
                        continuing="n";                      

			break;
                }
		case 3:
                {
                        // display all available Aircraft
			System.out.println("View all available aircraft\n");
                        
                                              
                        // for loop to display all available aircraft
                        for(int i=0;i<Plane.length;i++)
                        {
                            if (logic.CheckAirplaneAvailable(Plane, i)){
                                System.out.println(Plane[i].toString());
                            }
			}
                        
                        System.out.println("All Aircrafts that we have untill now");
                        
                        continuing="n";
                        break;
                }
                case 4:
                {
                       // display a particular aircraft
                        System.out.println("View a particular aircraft\n");
                        
                       //view a particular aircraft using the method CheckAircraft
                        logic.CheckAircraft(Plane);
                        continuing="n";
                        break;
                }
                case 5:
                {
                       // display all Pilots
                        System.out.println("View all Pilots\n");
                         
                        for(int i=0;i<Pilot.length;i++)
                        {
                           System.out.println(Pilot[i].toString()); 
                        }
                        
                        System.out.println("All Pilots able to flight");
                        continuing="n";
                        break;
                }
                case 6:
                {
                        // display a particular Pilot
                        System.out.println("View a particular Pilot\n");
                        
                        // view a particular Pilot using the method CheckPilot
                        logic.CheckPilot(Pilot); 
                        continuing="n";
                        break;
                }
                case 7:
                {
                    // create a new Flight
                     System.out.println("Create a flight(s)\n");
                     
                     System.out.println("How many Flights do you want to create: "); 
                     int answerQuantities = logic.CheckInputInt();
                     
                    // Using a method CreatingFlight
                     logic.CreatingFlight(Plane,Flight,answerQuantities);
                     continuing="n";

                    break;
                }
                case 8:
                {
                        System.out.println("Do you want exit? (Y/N)");
                        System.out.print("-> ");
                        String option1 = sc1.next();
                        if(option1.equalsIgnoreCase("y")){
                            continuing="y";
                            break;
                        }else{
                            continuing="n";
                            break;
                        }
                }
		default:{
			System.out.println("Invalid option!");
			break;
		}
             }
	} while (!continuing.equalsIgnoreCase("y"));
                }
}
        
        
        


        

