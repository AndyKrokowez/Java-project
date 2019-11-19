/*
a. Declare and initialize a number of flights. (create a minimum of 10 flights)
b.	Allow a user to add up to 5 flights of their choice. 
c.	Use the second version of the schedule method to set the time schedule for a flight. 
d.	Use the first version of the schedule method to update the arrival time for a flight in the list. 
e.	display all flights

 */
package cctair;

import java.util.ArrayList;

/**
 *
 * @author Anderson do Rego
 * @author Camila Weber
 *
 */
public class CCTAir 
{

    public static void main(String[] args) throws InterruptedException
    {
        
        System.out.println("Downloading Data \n Wait one moment");
        
        // creating a pause
        Thread.sleep(1500);
        
        ArrayList<Flight> flights = new ArrayList<>();
        
        // instance of pilot class
        Pilot[] pilot = new Pilot[29];
        
        // instance of aircraft class
        AirPlane[] airplane = new AirPlane[29];
        
        // instance of flight class
        ArrayList<Flight> flight = new ArrayList<>();
        
        // instance of logic class
        Logic logic = new Logic();
        
        // instance of setup class
        SetUp setup = new SetUp();
        System.out.println("Setting up Pilots"); 
        
        // setting up the Pilot
        pilot=setup.buildPilot(pilot);
        System.out.println("Setting up Planes"); 
        
        // setting up the the aircraft, sending pilot array as a parameter
        airplane=setup.buildAirPlane(pilot, airplane);
        System.out.println("Setting up Flights"); 
        
        // setting up the fight, sending airplane array as a parameter
        flight=setup.buildFlight(airplane,flight);
        
        // creating a pause
        Thread.sleep(1000);
        System.out.println("Getting Menu Ready");
        
        // creating a pause
        Thread.sleep(2000);
        
        // instance of the menu class
        Menu menu = new Menu();
        
        // starting menu
        Menu.started(pilot, airplane, flight);
    }
    
}

